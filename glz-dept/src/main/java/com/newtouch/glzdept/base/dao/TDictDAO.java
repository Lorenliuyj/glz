package com.newtouch.glzdept.base.dao;

import com.newtouch.glzdept.base.entity.VO.TDictVO;

import java.util.List;

public interface TDictDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TDictVO record);

    int insertSelective(TDictVO record);

    TDictVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TDictVO record);

    int updateByPrimaryKeyWithBLOBs(TDictVO record);

    int updateByPrimaryKey(TDictVO record);

    List<TDictVO> selectDictByVO(TDictVO record);

}
