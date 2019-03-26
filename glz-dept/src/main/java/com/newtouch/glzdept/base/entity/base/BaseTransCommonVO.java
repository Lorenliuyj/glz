package com.newtouch.glzdept.base.entity.base;

import java.util.List;

/**
 * 该类为基础数据模块公共传输类
 */
public class BaseTransCommonVO {
    /**
     * 含村落
     */
    private List<Long> villageIds;

    /**
     * 含部门
     */
    private List<Long> deptIds;


    public List<Long> getVillageIds() {
        return villageIds;
    }

    public void setVillageIds(List<Long> villageIds) {
        this.villageIds = villageIds;
    }

    public List<Long> getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(List<Long> deptIds) {
        this.deptIds = deptIds;
    }
}
