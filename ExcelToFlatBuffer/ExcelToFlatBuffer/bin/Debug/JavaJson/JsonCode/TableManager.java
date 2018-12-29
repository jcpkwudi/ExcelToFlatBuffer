// Generated by the table tool compiler.  DO NOT EDIT!

package com.cyou.fusion.table.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import com.cyou.fusion.table.core.TableUtility;

import java.util.ArrayList;

public class TableManager {

    private static final Logger logger = LoggerFactory.getLogger(TableManager.class);
    private static ArrayList<TableActor> gActorArray = null;
    private static TIntObjectHashMap<TableActor> gActorMap = new TIntObjectHashMap<TableActor>();

    private static boolean initTableActor() {
        try {
            gActorMap.clear();
            gActorArray = TableUtility.LoadJsonTable("Actor.json", TableActor.class);
            for (TableActor table : gActorArray) {
                gActorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableActor getActorByID(int nKey){
        return gActorMap.get(nKey);
    }

    public static final TableActor getActorByIndex(int nIdx){
        return gActorArray.get(nIdx);
    }

    public static final int getActorSize(){
        return gActorArray.size();
    }

    public static final TIntObjectIterator<TableActor> getActorByIterator() {
        return gActorMap.iterator();
    }
    private static ArrayList<TableActor> gActorArray = null;
    private static TIntObjectHashMap<TableActor> gActorMap = new TIntObjectHashMap<TableActor>();

    private static boolean initTableActor() {
        try {
            gActorMap.clear();
            gActorArray = TableUtility.LoadJsonTable("Actor.json", TableActor.class);
            for (TableActor table : gActorArray) {
                gActorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableActor getActorByID(int nKey){
        return gActorMap.get(nKey);
    }

    public static final TableActor getActorByIndex(int nIdx){
        return gActorArray.get(nIdx);
    }

    public static final int getActorSize(){
        return gActorArray.size();
    }

    public static final TIntObjectIterator<TableActor> getActorByIterator() {
        return gActorMap.iterator();
    }
    private static ArrayList<TableBuilding> gBuildingArray = null;
    private static TIntObjectHashMap<TableBuilding> gBuildingMap = new TIntObjectHashMap<TableBuilding>();

    private static boolean initTableBuilding() {
        try {
            gBuildingMap.clear();
            gBuildingArray = TableUtility.LoadJsonTable("Building.json", TableBuilding.class);
            for (TableBuilding table : gBuildingArray) {
                gBuildingMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableBuilding getBuildingByID(int nKey){
        return gBuildingMap.get(nKey);
    }

    public static final TableBuilding getBuildingByIndex(int nIdx){
        return gBuildingArray.get(nIdx);
    }

    public static final int getBuildingSize(){
        return gBuildingArray.size();
    }

    public static final TIntObjectIterator<TableBuilding> getBuildingByIterator() {
        return gBuildingMap.iterator();
    }
    private static ArrayList<TableBuilding> gBuildingArray = null;
    private static TIntObjectHashMap<TableBuilding> gBuildingMap = new TIntObjectHashMap<TableBuilding>();

    private static boolean initTableBuilding() {
        try {
            gBuildingMap.clear();
            gBuildingArray = TableUtility.LoadJsonTable("Building.json", TableBuilding.class);
            for (TableBuilding table : gBuildingArray) {
                gBuildingMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableBuilding getBuildingByID(int nKey){
        return gBuildingMap.get(nKey);
    }

    public static final TableBuilding getBuildingByIndex(int nIdx){
        return gBuildingArray.get(nIdx);
    }

    public static final int getBuildingSize(){
        return gBuildingArray.size();
    }

    public static final TIntObjectIterator<TableBuilding> getBuildingByIterator() {
        return gBuildingMap.iterator();
    }
    private static ArrayList<TableBuildingLevel> gBuildingLevelArray = null;
    private static TIntObjectHashMap<TableBuildingLevel> gBuildingLevelMap = new TIntObjectHashMap<TableBuildingLevel>();

    private static boolean initTableBuildingLevel() {
        try {
            gBuildingLevelMap.clear();
            gBuildingLevelArray = TableUtility.LoadJsonTable("BuildingLevel.json", TableBuildingLevel.class);
            for (TableBuildingLevel table : gBuildingLevelArray) {
                gBuildingLevelMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableBuildingLevel getBuildingLevelByID(int nKey){
        return gBuildingLevelMap.get(nKey);
    }

    public static final TableBuildingLevel getBuildingLevelByIndex(int nIdx){
        return gBuildingLevelArray.get(nIdx);
    }

    public static final int getBuildingLevelSize(){
        return gBuildingLevelArray.size();
    }

    public static final TIntObjectIterator<TableBuildingLevel> getBuildingLevelByIterator() {
        return gBuildingLevelMap.iterator();
    }
    private static ArrayList<TableBuildingLevel> gBuildingLevelArray = null;
    private static TIntObjectHashMap<TableBuildingLevel> gBuildingLevelMap = new TIntObjectHashMap<TableBuildingLevel>();

    private static boolean initTableBuildingLevel() {
        try {
            gBuildingLevelMap.clear();
            gBuildingLevelArray = TableUtility.LoadJsonTable("BuildingLevel.json", TableBuildingLevel.class);
            for (TableBuildingLevel table : gBuildingLevelArray) {
                gBuildingLevelMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableBuildingLevel getBuildingLevelByID(int nKey){
        return gBuildingLevelMap.get(nKey);
    }

    public static final TableBuildingLevel getBuildingLevelByIndex(int nIdx){
        return gBuildingLevelArray.get(nIdx);
    }

    public static final int getBuildingLevelSize(){
        return gBuildingLevelArray.size();
    }

    public static final TIntObjectIterator<TableBuildingLevel> getBuildingLevelByIterator() {
        return gBuildingLevelMap.iterator();
    }
    private static ArrayList<TableChapter> gChapterArray = null;
    private static TIntObjectHashMap<TableChapter> gChapterMap = new TIntObjectHashMap<TableChapter>();

    private static boolean initTableChapter() {
        try {
            gChapterMap.clear();
            gChapterArray = TableUtility.LoadJsonTable("Chapter.json", TableChapter.class);
            for (TableChapter table : gChapterArray) {
                gChapterMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableChapter getChapterByID(int nKey){
        return gChapterMap.get(nKey);
    }

    public static final TableChapter getChapterByIndex(int nIdx){
        return gChapterArray.get(nIdx);
    }

    public static final int getChapterSize(){
        return gChapterArray.size();
    }

    public static final TIntObjectIterator<TableChapter> getChapterByIterator() {
        return gChapterMap.iterator();
    }
    private static ArrayList<TableChapter> gChapterArray = null;
    private static TIntObjectHashMap<TableChapter> gChapterMap = new TIntObjectHashMap<TableChapter>();

    private static boolean initTableChapter() {
        try {
            gChapterMap.clear();
            gChapterArray = TableUtility.LoadJsonTable("Chapter.json", TableChapter.class);
            for (TableChapter table : gChapterArray) {
                gChapterMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableChapter getChapterByID(int nKey){
        return gChapterMap.get(nKey);
    }

    public static final TableChapter getChapterByIndex(int nIdx){
        return gChapterArray.get(nIdx);
    }

    public static final int getChapterSize(){
        return gChapterArray.size();
    }

    public static final TIntObjectIterator<TableChapter> getChapterByIterator() {
        return gChapterMap.iterator();
    }
    private static ArrayList<TableCharactor> gCharactorArray = null;
    private static TIntObjectHashMap<TableCharactor> gCharactorMap = new TIntObjectHashMap<TableCharactor>();

    private static boolean initTableCharactor() {
        try {
            gCharactorMap.clear();
            gCharactorArray = TableUtility.LoadJsonTable("Charactor.json", TableCharactor.class);
            for (TableCharactor table : gCharactorArray) {
                gCharactorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableCharactor getCharactorByID(int nKey){
        return gCharactorMap.get(nKey);
    }

    public static final TableCharactor getCharactorByIndex(int nIdx){
        return gCharactorArray.get(nIdx);
    }

    public static final int getCharactorSize(){
        return gCharactorArray.size();
    }

    public static final TIntObjectIterator<TableCharactor> getCharactorByIterator() {
        return gCharactorMap.iterator();
    }
    private static ArrayList<TableCharactor> gCharactorArray = null;
    private static TIntObjectHashMap<TableCharactor> gCharactorMap = new TIntObjectHashMap<TableCharactor>();

    private static boolean initTableCharactor() {
        try {
            gCharactorMap.clear();
            gCharactorArray = TableUtility.LoadJsonTable("Charactor.json", TableCharactor.class);
            for (TableCharactor table : gCharactorArray) {
                gCharactorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableCharactor getCharactorByID(int nKey){
        return gCharactorMap.get(nKey);
    }

    public static final TableCharactor getCharactorByIndex(int nIdx){
        return gCharactorArray.get(nIdx);
    }

    public static final int getCharactorSize(){
        return gCharactorArray.size();
    }

    public static final TIntObjectIterator<TableCharactor> getCharactorByIterator() {
        return gCharactorMap.iterator();
    }
    private static ArrayList<TableCommonItem> gCommonItemArray = null;
    private static TIntObjectHashMap<TableCommonItem> gCommonItemMap = new TIntObjectHashMap<TableCommonItem>();

    private static boolean initTableCommonItem() {
        try {
            gCommonItemMap.clear();
            gCommonItemArray = TableUtility.LoadJsonTable("CommonItem.json", TableCommonItem.class);
            for (TableCommonItem table : gCommonItemArray) {
                gCommonItemMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableCommonItem getCommonItemByID(int nKey){
        return gCommonItemMap.get(nKey);
    }

    public static final TableCommonItem getCommonItemByIndex(int nIdx){
        return gCommonItemArray.get(nIdx);
    }

    public static final int getCommonItemSize(){
        return gCommonItemArray.size();
    }

    public static final TIntObjectIterator<TableCommonItem> getCommonItemByIterator() {
        return gCommonItemMap.iterator();
    }
    private static ArrayList<TableCommonItem> gCommonItemArray = null;
    private static TIntObjectHashMap<TableCommonItem> gCommonItemMap = new TIntObjectHashMap<TableCommonItem>();

    private static boolean initTableCommonItem() {
        try {
            gCommonItemMap.clear();
            gCommonItemArray = TableUtility.LoadJsonTable("CommonItem.json", TableCommonItem.class);
            for (TableCommonItem table : gCommonItemArray) {
                gCommonItemMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableCommonItem getCommonItemByID(int nKey){
        return gCommonItemMap.get(nKey);
    }

    public static final TableCommonItem getCommonItemByIndex(int nIdx){
        return gCommonItemArray.get(nIdx);
    }

    public static final int getCommonItemSize(){
        return gCommonItemArray.size();
    }

    public static final TIntObjectIterator<TableCommonItem> getCommonItemByIterator() {
        return gCommonItemMap.iterator();
    }
    private static ArrayList<TableConstConfig> gConstConfigArray = null;
    private static TIntObjectHashMap<TableConstConfig> gConstConfigMap = new TIntObjectHashMap<TableConstConfig>();

    private static boolean initTableConstConfig() {
        try {
            gConstConfigMap.clear();
            gConstConfigArray = TableUtility.LoadJsonTable("ConstConfig.json", TableConstConfig.class);
            for (TableConstConfig table : gConstConfigArray) {
                gConstConfigMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableConstConfig getConstConfigByID(int nKey){
        return gConstConfigMap.get(nKey);
    }

    public static final TableConstConfig getConstConfigByIndex(int nIdx){
        return gConstConfigArray.get(nIdx);
    }

    public static final int getConstConfigSize(){
        return gConstConfigArray.size();
    }

    public static final TIntObjectIterator<TableConstConfig> getConstConfigByIterator() {
        return gConstConfigMap.iterator();
    }
    private static ArrayList<TableConstConfig> gConstConfigArray = null;
    private static TIntObjectHashMap<TableConstConfig> gConstConfigMap = new TIntObjectHashMap<TableConstConfig>();

    private static boolean initTableConstConfig() {
        try {
            gConstConfigMap.clear();
            gConstConfigArray = TableUtility.LoadJsonTable("ConstConfig.json", TableConstConfig.class);
            for (TableConstConfig table : gConstConfigArray) {
                gConstConfigMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableConstConfig getConstConfigByID(int nKey){
        return gConstConfigMap.get(nKey);
    }

    public static final TableConstConfig getConstConfigByIndex(int nIdx){
        return gConstConfigArray.get(nIdx);
    }

    public static final int getConstConfigSize(){
        return gConstConfigArray.size();
    }

    public static final TIntObjectIterator<TableConstConfig> getConstConfigByIterator() {
        return gConstConfigMap.iterator();
    }
    private static ArrayList<TableEagleChickActor> gEagleChickActorArray = null;
    private static TIntObjectHashMap<TableEagleChickActor> gEagleChickActorMap = new TIntObjectHashMap<TableEagleChickActor>();

    private static boolean initTableEagleChickActor() {
        try {
            gEagleChickActorMap.clear();
            gEagleChickActorArray = TableUtility.LoadJsonTable("EagleChickActor.json", TableEagleChickActor.class);
            for (TableEagleChickActor table : gEagleChickActorArray) {
                gEagleChickActorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickActor getEagleChickActorByID(int nKey){
        return gEagleChickActorMap.get(nKey);
    }

    public static final TableEagleChickActor getEagleChickActorByIndex(int nIdx){
        return gEagleChickActorArray.get(nIdx);
    }

    public static final int getEagleChickActorSize(){
        return gEagleChickActorArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickActor> getEagleChickActorByIterator() {
        return gEagleChickActorMap.iterator();
    }
    private static ArrayList<TableEagleChickActor> gEagleChickActorArray = null;
    private static TIntObjectHashMap<TableEagleChickActor> gEagleChickActorMap = new TIntObjectHashMap<TableEagleChickActor>();

    private static boolean initTableEagleChickActor() {
        try {
            gEagleChickActorMap.clear();
            gEagleChickActorArray = TableUtility.LoadJsonTable("EagleChickActor.json", TableEagleChickActor.class);
            for (TableEagleChickActor table : gEagleChickActorArray) {
                gEagleChickActorMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickActor getEagleChickActorByID(int nKey){
        return gEagleChickActorMap.get(nKey);
    }

    public static final TableEagleChickActor getEagleChickActorByIndex(int nIdx){
        return gEagleChickActorArray.get(nIdx);
    }

    public static final int getEagleChickActorSize(){
        return gEagleChickActorArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickActor> getEagleChickActorByIterator() {
        return gEagleChickActorMap.iterator();
    }
    private static ArrayList<TableEagleChickMap> gEagleChickMapArray = null;
    private static TIntObjectHashMap<TableEagleChickMap> gEagleChickMapMap = new TIntObjectHashMap<TableEagleChickMap>();

    private static boolean initTableEagleChickMap() {
        try {
            gEagleChickMapMap.clear();
            gEagleChickMapArray = TableUtility.LoadJsonTable("EagleChickMap.json", TableEagleChickMap.class);
            for (TableEagleChickMap table : gEagleChickMapArray) {
                gEagleChickMapMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickMap getEagleChickMapByID(int nKey){
        return gEagleChickMapMap.get(nKey);
    }

    public static final TableEagleChickMap getEagleChickMapByIndex(int nIdx){
        return gEagleChickMapArray.get(nIdx);
    }

    public static final int getEagleChickMapSize(){
        return gEagleChickMapArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickMap> getEagleChickMapByIterator() {
        return gEagleChickMapMap.iterator();
    }
    private static ArrayList<TableEagleChickMap> gEagleChickMapArray = null;
    private static TIntObjectHashMap<TableEagleChickMap> gEagleChickMapMap = new TIntObjectHashMap<TableEagleChickMap>();

    private static boolean initTableEagleChickMap() {
        try {
            gEagleChickMapMap.clear();
            gEagleChickMapArray = TableUtility.LoadJsonTable("EagleChickMap.json", TableEagleChickMap.class);
            for (TableEagleChickMap table : gEagleChickMapArray) {
                gEagleChickMapMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickMap getEagleChickMapByID(int nKey){
        return gEagleChickMapMap.get(nKey);
    }

    public static final TableEagleChickMap getEagleChickMapByIndex(int nIdx){
        return gEagleChickMapArray.get(nIdx);
    }

    public static final int getEagleChickMapSize(){
        return gEagleChickMapArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickMap> getEagleChickMapByIterator() {
        return gEagleChickMapMap.iterator();
    }
    private static ArrayList<TableEagleChickMapConfig> gEagleChickMapConfigArray = null;
    private static TIntObjectHashMap<TableEagleChickMapConfig> gEagleChickMapConfigMap = new TIntObjectHashMap<TableEagleChickMapConfig>();

    private static boolean initTableEagleChickMapConfig() {
        try {
            gEagleChickMapConfigMap.clear();
            gEagleChickMapConfigArray = TableUtility.LoadJsonTable("EagleChickMapConfig.json", TableEagleChickMapConfig.class);
            for (TableEagleChickMapConfig table : gEagleChickMapConfigArray) {
                gEagleChickMapConfigMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickMapConfig getEagleChickMapConfigByID(int nKey){
        return gEagleChickMapConfigMap.get(nKey);
    }

    public static final TableEagleChickMapConfig getEagleChickMapConfigByIndex(int nIdx){
        return gEagleChickMapConfigArray.get(nIdx);
    }

    public static final int getEagleChickMapConfigSize(){
        return gEagleChickMapConfigArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickMapConfig> getEagleChickMapConfigByIterator() {
        return gEagleChickMapConfigMap.iterator();
    }
    private static ArrayList<TableEagleChickMapConfig> gEagleChickMapConfigArray = null;
    private static TIntObjectHashMap<TableEagleChickMapConfig> gEagleChickMapConfigMap = new TIntObjectHashMap<TableEagleChickMapConfig>();

    private static boolean initTableEagleChickMapConfig() {
        try {
            gEagleChickMapConfigMap.clear();
            gEagleChickMapConfigArray = TableUtility.LoadJsonTable("EagleChickMapConfig.json", TableEagleChickMapConfig.class);
            for (TableEagleChickMapConfig table : gEagleChickMapConfigArray) {
                gEagleChickMapConfigMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableEagleChickMapConfig getEagleChickMapConfigByID(int nKey){
        return gEagleChickMapConfigMap.get(nKey);
    }

    public static final TableEagleChickMapConfig getEagleChickMapConfigByIndex(int nIdx){
        return gEagleChickMapConfigArray.get(nIdx);
    }

    public static final int getEagleChickMapConfigSize(){
        return gEagleChickMapConfigArray.size();
    }

    public static final TIntObjectIterator<TableEagleChickMapConfig> getEagleChickMapConfigByIterator() {
        return gEagleChickMapConfigMap.iterator();
    }
    private static ArrayList<TableGameLevels> gGameLevelsArray = null;
    private static TIntObjectHashMap<TableGameLevels> gGameLevelsMap = new TIntObjectHashMap<TableGameLevels>();

    private static boolean initTableGameLevels() {
        try {
            gGameLevelsMap.clear();
            gGameLevelsArray = TableUtility.LoadJsonTable("GameLevels.json", TableGameLevels.class);
            for (TableGameLevels table : gGameLevelsArray) {
                gGameLevelsMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableGameLevels getGameLevelsByID(int nKey){
        return gGameLevelsMap.get(nKey);
    }

    public static final TableGameLevels getGameLevelsByIndex(int nIdx){
        return gGameLevelsArray.get(nIdx);
    }

    public static final int getGameLevelsSize(){
        return gGameLevelsArray.size();
    }

    public static final TIntObjectIterator<TableGameLevels> getGameLevelsByIterator() {
        return gGameLevelsMap.iterator();
    }
    private static ArrayList<TableGameLevels> gGameLevelsArray = null;
    private static TIntObjectHashMap<TableGameLevels> gGameLevelsMap = new TIntObjectHashMap<TableGameLevels>();

    private static boolean initTableGameLevels() {
        try {
            gGameLevelsMap.clear();
            gGameLevelsArray = TableUtility.LoadJsonTable("GameLevels.json", TableGameLevels.class);
            for (TableGameLevels table : gGameLevelsArray) {
                gGameLevelsMap.put(table.getId(), table);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static final TableGameLevels getGameLevelsByID(int nKey){
        return gGameLevelsMap.get(nKey);
    }

    public static final TableGameLevels getGameLevelsByIndex(int nIdx){
        return gGameLevelsArray.get(nIdx);
    }

    public static final int getGameLevelsSize(){
        return gGameLevelsArray.size();
    }

    public static final TIntObjectIterator<TableGameLevels> getGameLevelsByIterator() {
        return gGameLevelsMap.iterator();
    }


    public static boolean initTable(){
        if (!initTableActor()){
           logger.error("load table Actor error!");
           return false;
        }
        if (!initTableActor()){
           logger.error("load table Actor error!");
           return false;
        }
        if (!initTableBuilding()){
           logger.error("load table Building error!");
           return false;
        }
        if (!initTableBuilding()){
           logger.error("load table Building error!");
           return false;
        }
        if (!initTableBuildingLevel()){
           logger.error("load table BuildingLevel error!");
           return false;
        }
        if (!initTableBuildingLevel()){
           logger.error("load table BuildingLevel error!");
           return false;
        }
        if (!initTableChapter()){
           logger.error("load table Chapter error!");
           return false;
        }
        if (!initTableChapter()){
           logger.error("load table Chapter error!");
           return false;
        }
        if (!initTableCharactor()){
           logger.error("load table Charactor error!");
           return false;
        }
        if (!initTableCharactor()){
           logger.error("load table Charactor error!");
           return false;
        }
        if (!initTableCommonItem()){
           logger.error("load table CommonItem error!");
           return false;
        }
        if (!initTableCommonItem()){
           logger.error("load table CommonItem error!");
           return false;
        }
        if (!initTableConstConfig()){
           logger.error("load table ConstConfig error!");
           return false;
        }
        if (!initTableConstConfig()){
           logger.error("load table ConstConfig error!");
           return false;
        }
        if (!initTableEagleChickActor()){
           logger.error("load table EagleChickActor error!");
           return false;
        }
        if (!initTableEagleChickActor()){
           logger.error("load table EagleChickActor error!");
           return false;
        }
        if (!initTableEagleChickMap()){
           logger.error("load table EagleChickMap error!");
           return false;
        }
        if (!initTableEagleChickMap()){
           logger.error("load table EagleChickMap error!");
           return false;
        }
        if (!initTableEagleChickMapConfig()){
           logger.error("load table EagleChickMapConfig error!");
           return false;
        }
        if (!initTableEagleChickMapConfig()){
           logger.error("load table EagleChickMapConfig error!");
           return false;
        }
        if (!initTableGameLevels()){
           logger.error("load table GameLevels error!");
           return false;
        }
        if (!initTableGameLevels()){
           logger.error("load table GameLevels error!");
           return false;
        }

        return true;
    }
}