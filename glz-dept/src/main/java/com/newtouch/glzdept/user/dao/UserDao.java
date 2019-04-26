package com.newtouch.glzdept.user.dao;

import com.newtouch.glzdept.user.entity.VO.TUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(TUserVO record);

    int insertSelective(TUserVO record);

    TUserVO selectByPrimaryKey(@Param("id")Long id);

    int updateByPrimaryKeySelective(TUserVO record);

    int updateByPrimaryKeyWithBLOBs(TUserVO record);

    int updateByPrimaryKey(TUserVO record);

    List<TUserVO> userLogin(TUserVO record);

    List<TUserVO> selectDeptById(@Param("id")Long id);

    List<TUserVO> selectVillageById(@Param("id")Long id);

}
