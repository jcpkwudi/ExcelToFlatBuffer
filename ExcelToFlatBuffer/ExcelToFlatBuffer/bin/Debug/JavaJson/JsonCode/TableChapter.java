// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TableChapter {

     @JsonProperty("Id")
     private int mId;
     @JsonProperty("Desc")
     private String mDesc;
     @JsonProperty("Name")
     private String mName;
     @JsonProperty("Levelsum")
     private int mLevelsum;
     @JsonProperty("Dragrangxmax")
     private float mDragrangxmax;
     @JsonProperty("Dragrangxmin")
     private float mDragrangxmin;
     @JsonProperty("Dragrangzmax")
     private float mDragrangzmax;
     @JsonProperty("Dragrangzmin")
     private float mDragrangzmin;
     @JsonProperty("Pinchviewrangmax")
     private float mPinchviewrangmax;
     @JsonProperty("Pinchviewrangmin")
     private float mPinchviewrangmin;
     @JsonProperty("Dragspeed")
     private float mDragspeed;
     @JsonProperty("Pichspeed")
     private float mPichspeed;


     //#章节表ID     
     public int getId(){return this.mId;}
     //程序不读     
     public String getDesc(){return this.mDesc;}
     //章节名称     
     public String getName(){return this.mName;}
     //关卡数量     
     public int getLevelsum(){return this.mLevelsum;}
     //X轴拖动的最大值     
     public float getDragrangxmax(){return this.mDragrangxmax;}
     //X轴拖动的最小值     
     public float getDragrangxmin(){return this.mDragrangxmin;}
     //Z轴拖动的最大值     
     public float getDragrangzmax(){return this.mDragrangzmax;}
     //Z轴拖动的最小值     
     public float getDragrangzmin(){return this.mDragrangzmin;}
     //相机视野最大值     
     public float getPinchviewrangmax(){return this.mPinchviewrangmax;}
     //相机视野最小值     
     public float getPinchviewrangmin(){return this.mPinchviewrangmin;}
     //场景的拖动速度     
     public float getDragspeed(){return this.mDragspeed;}
     //场景的缩放速度     
     public float getPichspeed(){return this.mPichspeed;}


}