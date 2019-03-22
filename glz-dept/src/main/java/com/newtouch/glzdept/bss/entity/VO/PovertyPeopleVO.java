package com.newtouch.glzdept.bss.entity.VO;

import com.newtouch.glzdept.bss.entity.PO.PovertyPeoplePO;

import java.util.List;


/**
 * @author: lgyu6
 * @date: 2019/3/9 下午3:42
 * project:glz-dept
 */
public class PovertyPeopleVO extends PovertyPeoplePO {

    private List<String> villages;

    private List<String> povertyType1s;

    private List<String> povertyType2s;

    public List<String> getVillages() {
        return villages;
    }

    public void setVillages(List<String> villages) {
        this.villages = villages;
    }

    public List<String> getPovertyType1s() {
        return povertyType1s;
    }

    public void setPovertyType1s(List<String> povertyType1s) {
        this.povertyType1s = povertyType1s;
    }

    public List<String> getPovertyType2s() {
        return povertyType2s;
    }

    public void setPovertyType2s(List<String> povertyType2s) {
        this.povertyType2s = povertyType2s;
    }
}

