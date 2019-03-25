package com.newtouch.glzdept.base.dao;

import com.newtouch.glzdept.base.entity.VO.TDepartmentVO;

public interface TDepartmentDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TDepartmentVO record);

    int insertSelective(TDepartmentVO record);

    TDepartmentVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TDepartmentVO record);

    int updateByPrimaryKey(TDepartmentVO record);
}
