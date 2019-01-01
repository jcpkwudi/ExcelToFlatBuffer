// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TableSceneClass {

     @JsonProperty("Id")
     private int mId;
     @JsonProperty("Desc")
     private String mDesc;
     @JsonProperty("Resname")
     private String mResname;
     @JsonProperty("Atktype")
     private int mAtktype;
     @JsonProperty("Type")
     private int mType;
     @JsonProperty("Loadingtype")
     private int mLoadingtype;
     @JsonProperty("Scriptid")
     private int mScriptid;
     @JsonProperty("Obstacle")
     private String mObstacle;
     @JsonProperty("Maxplayer")
     private int mMaxplayer;
     @JsonProperty("Scenemaplogicwidth")
     private int mScenemaplogicwidth;
     @JsonProperty("Bgmusic")
     private int mBgmusic;
     @JsonProperty("Minimapname")
     private String mMinimapname;
     @JsonProperty("Bigminimapname")
     private String mBigminimapname;
     @JsonProperty("Camerasettingid")
     private int mCamerasettingid;
     @JsonProperty("Shadowssettingid")
     private int mShadowssettingid;
     @JsonProperty("Minx")
     private float mMinx;
     @JsonProperty("Maxx")
     private float mMaxx;
     @JsonProperty("Minz")
     private float mMinz;
     @JsonProperty("Maxz")
     private float mMaxz;
     @JsonProperty("Assetgroup")
     private String mAssetgroup;


     //#场景ID     
     public int getId(){return this.mId;}
     //描述(不读)     
     public String getDesc(){return this.mDesc;}
     //资源名称     
     public String getResname(){return this.mResname;}
     //类型(-1登陆等无关场景，0主城，1战斗场景)     
     public int getAtktype(){return this.mAtktype;}
     //类型(-1客户端场景，0主城，1副本场景)     
     public int getType(){return this.mType;}
     //Loading界面类型(0:无需loading直接切换 1:使用普通loading; 2:城建Loading; 3.视情况而定)     
     public int getLoadingtype(){return this.mLoadingtype;}
     //服务器用脚本ID（客户端场景填-1，无脚本的填-1）     
     public int getScriptid(){return this.mScriptid;}
     //阻挡文件(服务器使用)     
     public String getObstacle(){return this.mObstacle;}
     //场景内玩家数量上限     
     public int getMaxplayer(){return this.mMaxplayer;}
     //场景地图宽度     
     public int getScenemaplogicwidth(){return this.mScenemaplogicwidth;}
     //背景音乐ID     
     public int getBgmusic(){return this.mBgmusic;}
     //小地图的名称     
     public String getMinimapname(){return this.mMinimapname;}
     //展开小地图的名称     
     public String getBigminimapname(){return this.mBigminimapname;}
     //主摄像机设置ID     
     public int getCamerasettingid(){return this.mCamerasettingid;}
     //投影参数设置     
     public int getShadowssettingid(){return this.mShadowssettingid;}
     //摄像机移动最小X     
     public float getMinx(){return this.mMinx;}
     //摄像机移动最大X     
     public float getMaxx(){return this.mMaxx;}
     //摄像机移动最小Z     
     public float getMinz(){return this.mMinz;}
     //摄像机移动最大Z     
     public float getMaxz(){return this.mMaxz;}
     //资源ID组（String）     
     public String getAssetgroup(){return this.mAssetgroup;}


}