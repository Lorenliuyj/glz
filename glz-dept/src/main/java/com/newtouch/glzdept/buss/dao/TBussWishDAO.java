package com.newtouch.glzdept.buss.dao;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBussWishDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TBussWishVO record);

    int insertSelective(TBussWishVO record);

    TBussWishVO selectByPrimaryKey(@Param("id")Long id);

    int updateByPrimaryKeySelective(TBussWishVO record);

    int updateByPrimaryKey(TBussWishVO record);

    List<TBussWishVO> selectWishCount(BaseTransCommonVO baseTransCommonVO);

    List<TBussWishVO> selectWishCountByPid(PovertyPeopleVO povertyPeopleVO);

    List<TBussWishVO> selectWishPage(@Param("page")Page page, @Param("tBussWishVO")TBussWishVO tBussWishVO);

    int selectTotalNum(@Param("tBussWishVO")TBussWishVO tBussWishVO);
}