package com.newtouch.glzdept.buss.dao;

import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;

public interface TBussWishDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TBussWishVO record);

    int insertSelective(TBussWishVO record);

    TBussWishVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBussWishVO record);

    int updateByPrimaryKey(TBussWishVO record);
}