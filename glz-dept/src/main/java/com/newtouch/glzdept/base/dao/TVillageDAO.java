package com.newtouch.glzdept.base.dao;

import com.newtouch.glzdept.base.entity.VO.TVillageVO;

public interface TVillageDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TVillageVO record);

    int insertSelective(TVillageVO record);

    TVillageVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVillageVO record);

    int updateByPrimaryKey(TVillageVO record);
}