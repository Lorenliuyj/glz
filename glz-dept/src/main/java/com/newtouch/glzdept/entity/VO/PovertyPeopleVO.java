package com.newtouch.glzdept.entity.VO;

import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;

import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午3:42
 * project:glz-dept
 */
public class PovertyPeopleVO extends PovertyPeoplePO{

    private List<PictureVO> pictures;

    public List<PictureVO> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureVO> pictures) {
        this.pictures = pictures;
    }
}

