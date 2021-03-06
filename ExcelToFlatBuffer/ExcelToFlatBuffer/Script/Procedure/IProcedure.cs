﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using NPOI;
using NPOI.HSSF.UserModel;
using NPOI.SS.UserModel;

namespace ExcelToFlatBuffer
{
    public interface IProcedure
    {
        bool Procedure_ReadExcel();
        bool Proceduree_GenerateFbs(ExcelData excelData);
        bool Procedure_GenerateFlatBufferCode(ExcelData excelData);
        bool Procedure_ChangeFlatBufferCode(ExcelData excelData);
        bool Procedure_GenerateBuildFlatBufferCode(ExcelData excelData);
        bool Procedure_CompileCode();
        bool Procedure_GenerateBytes();
    }

    public partial class Procedure : IProcedure
    {
        private static Procedure m_Instance;

        private Queue<System.Action> m_actionQueue = new Queue<Action>();

        private Dictionary<string, bool> m_loading = new Dictionary<string, bool>();

        public static Procedure Instance
        {
            get
            {
                if (m_Instance == null)
                    m_Instance = new Procedure();
                return m_Instance;
            }
        }


        public void Execute()
        {
            Debug.Log("正在清理缓存...");
            SchemeType scheme = Setting.GetCurSchemeType();

            if (scheme == SchemeType.Client_CSharp_To_FlatBuffer)
            {
                Tools.DeleteFilesWithoutFolder(Setting.GenerateByteFilePath);
                Tools.DeleteFilesWithoutFolder(Setting.GenerateFlatCodePath);
            }
            else if (scheme == SchemeType.Server_Java_To_Json)
            {
                Tools.DeleteFilesWithoutFolder(Setting.GenServerJavaJsonFilePath);
                Tools.DeleteFilesWithoutFolder(Setting.GenJavaServerJsonCodePath);
            }
            else if(scheme == SchemeType.UnKown)
            {
                MessageBox.Show("Excel路径不能为空!");
                return;
            }



            AddDelayRun(() =>
            {
                Debug.Log("清理完毕.准备读取配表..");
                m_Instance.Procedure_ReadExcel();
            });
        }


        public void Update()
        {
            if (m_actionQueue.Count == 0)
                return;
            System.Action action = m_actionQueue.Dequeue();
            if (action != null)
                action.Invoke();
        }

        /// <summary>
        /// 分帧处理
        /// </summary>
        public void AddDelayRun(System.Action action)
        {
            lock (m_actionQueue)
            {
                m_actionQueue.Enqueue(action);
            }
        }

        public void SetGenerateCodeFinish(string codeName)
        {
            if (m_loading.ContainsKey(codeName))
                m_loading[codeName] = true;
            else
                Debug.LogError("生成代码"+ codeName + "成功,但它并没有注册");
        }

        public bool IsAllCodeGenerateFinish
        {
            get
            {
                foreach (bool value in m_loading.Values)
                {
                    if (!value)
                        return false;
                }
                return true;
            }
        }

    }


    public class ExcelData
    {
        public string Name { private set; get; }

        public string Path { private set; get; }

        public string Extension { private set; get; }

        public string FileName { private set; get; }

        public string FbsPath { private set; get; }

        private List<List<string>> m_DataCache;

        //Key值类型 0:Int  1:String
        public int KeyType { private set; get; }
        /// <summary>
        /// Key值对应行的行号
        /// </summary>
        public string KeyValueString { private set; get; }

        public ExcelData(string excelPath)
        {
            Path = excelPath;
            FileName = System.IO.Path.GetFileName(excelPath);
            Extension = System.IO.Path.GetExtension(excelPath);
            Name = FileName.Replace(Extension, "");
            FbsPath = System.IO.Path.Combine(Setting.GenerateFbsPath, "Table_"+this.Name + ".fbs");

            m_DataCache = new List<List<string>>();
        }

        public void AddRowData(List<string> rowData)
        {
            int rowIndex = m_DataCache.Count;
            m_DataCache.Add(rowData);
            if (rowIndex == 0)
            {
                rowData[0] = rowData[0].Replace("#", "");  //第一列做为Key不能注释
                for (int i = 0; i < rowData.Count; i++)
                {
                    string temp = rowData[i].ToLower();
                    rowData[i] = temp[0].ToString().ToUpper() + temp.Substring(1);
                }

                string keyType = rowData[0];
                if (keyType == "int")
                    KeyType = 0;
                else if (keyType == "string")
                    KeyType = 1;
            }
            else if (rowIndex == 1)
            {
                rowData[0] = rowData[0].Replace("#", ""); //第一列做为Key不能注释
                for (int i = 0; i < rowData.Count; i++)
                {
                    rowData[i] = rowData[i].ToLower();
                }
            }
            else if (rowIndex > 2)
            {
                KeyValueString += string.Format(@"{{{0},{1}}},", rowData[0], rowIndex - 3);
            }
               
        }

        public List<string> GetRowData(int rowIndex)
        {
            List<string> rowDataList = null;
            if (rowIndex < m_DataCache.Count)
            {
                rowDataList = m_DataCache[rowIndex];
            }
            return rowDataList;
        }

        public List<List<string>> GetAllRows()
        {
            return m_DataCache;
        }

        /// <summary>
        /// 获取字段类型
        /// </summary>
        /// <param name="columnIndex"></param>
        /// <returns></returns>
        public string GetTypeName(int columnIndex)
        {
            if (m_DataCache.Count > 1)
                return m_DataCache[1][columnIndex].ToLower();
            else
                return "";
        }

        /// <summary>
        /// 获取字段名称
        /// </summary>
        /// <param name="columnIndex"></param>
        /// <returns></returns>
        public string GetWordName(int columnIndex)
        {
            if (m_DataCache.Count > 0)
                return m_DataCache[0][columnIndex];
            else
                return "";
        }


        public int GetAllRowCount()
        {
            return m_DataCache.Count;
        }


        public int GetAllColumCount()
        {
            return m_DataCache[0].Count;
        }

    }

}



