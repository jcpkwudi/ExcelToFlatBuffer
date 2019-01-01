// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TableBuilding {

     @JsonProperty("Id")
     private int mId;
     @JsonProperty("Desc")
     private String mDesc;
     @JsonProperty("Positionx")
     private float mPositionx;
     @JsonProperty("Positiony")
     private float mPositiony;
     @JsonProperty("Positionz")
     private float mPositionz;
     @JsonProperty("Area")
     private int mArea;
     @JsonProperty("Statestoryprogress")
     private List<Integer> mStatestoryprogress;
     @JsonProperty("Statemodel")
     private List<Integer> mStatemodel;
     @JsonProperty("Model")
     private List<Integer> mModel;
     @JsonProperty("Changecost")
     private int mChangecost;
     @JsonProperty("Icon")
     private List<Integer> mIcon;
     @JsonProperty("Name")
     private List<String> mName;
     @JsonProperty("Workerposition")
     private List<String> mWorkerposition;


     //#ID     
     public int getId(){return this.mId;}
     //描述(不读)     
     public String getDesc(){return this.mDesc;}
     //任务聚焦的摄像机位置（X、Y、Z）     
     public float getPositionx(){return this.mPositionx;}
     //该字段未添加注释     
     public float getPositiony(){return this.mPositiony;}
     //该字段未添加注释     
     public float getPositionz(){return this.mPositionz;}
     //所属园区（暂无用处)     
     public int getArea(){return this.mArea;}
     //状态的剧情进度0     
     public List<Integer> getStatestoryprogress(){return this.mStatestoryprogress;}
     //状态的模型Id0     
     public List<Integer> getStatemodel(){return this.mStatemodel;}
     //模型1(Resource表ID）     
     public List<Integer> getModel(){return this.mModel;}
     //更换模型花费金币     
     public int getChangecost(){return this.mChangecost;}
     //模型1Icon     
     public List<Integer> getIcon(){return this.mIcon;}
     //模型1名字     
     public List<String> getName(){return this.mName;}
     //工人刷新的初始位置1     
     public List<String> getWorkerposition(){return this.mWorkerposition;}


}