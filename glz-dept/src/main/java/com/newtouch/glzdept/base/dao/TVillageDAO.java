package com.newtouch.glzdept.base.dao;

import com.newtouch.glzdept.base.entity.VO.TVillageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TVillageDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TVillageVO record);

    int insertSelective(TVillageVO record);

    TVillageVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVillageVO record);

    int updateByPrimaryKey(TVillageVO record);

    List<TVillageVO> selectVillageByIds(@Param("list")List<Long> list);

}
