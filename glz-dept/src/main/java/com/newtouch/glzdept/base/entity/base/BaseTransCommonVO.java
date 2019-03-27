package com.newtouch.glzdept.base.entity.base;

import java.util.List;

/**
 * 该类为基础数据模块公共传输类
 */
public class BaseTransCommonVO <T>{
    /**
     * 含村落
     */
    private List<T> baseVillageIds;

    /**
     * 含部门
     */
    private List<T> baseDeptIds;


    public List<T> getBaseVillageIds() {
        return baseVillageIds;
    }

    public void setBaseVillageIds(List<T> baseVillageIds) {
        this.baseVillageIds = baseVillageIds;
    }

    public List<T> getBaseDeptIds() {
        return baseDeptIds;
    }

    public void setBaseDeptIds(List<T> baseDeptIds) {
        this.baseDeptIds = baseDeptIds;
    }
}
