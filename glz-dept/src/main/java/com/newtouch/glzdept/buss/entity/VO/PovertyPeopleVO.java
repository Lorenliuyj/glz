package com.newtouch.glzdept.buss.entity.VO;

import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;

import java.util.List;


/**
 * @author: lgyu6
 * @date: 2019/3/9 下午3:42
 * project:glz-dept
 */
public class PovertyPeopleVO extends PovertyPeoplePO {

    private List<String> villageIds;

    private List<String> deptIds;

    private List<String> troubleIds;


    public List<String> getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(List<String> deptIds) {
        this.deptIds = deptIds;
    }

    public List<String> getTroubleIds() {
        return troubleIds;
    }

    public void setTroubleIds(List<String> troubleIds) {
        this.troubleIds = troubleIds;
    }

    public List<String> getVillageIds() {
        return villageIds;
    }

    public void setVillageIds(List<String> villageIds) {
        this.villageIds = villageIds;
    }
}

