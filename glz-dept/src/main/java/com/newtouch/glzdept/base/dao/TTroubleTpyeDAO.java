package com.newtouch.glzdept.base.dao;

import com.newtouch.glzdept.base.entity.VO.TTroubleTpyeVO;

import java.util.List;

public interface TTroubleTpyeDAO {
    int deleteByPrimaryKey(Long id);

    int insert(TTroubleTpyeVO record);

    int insertSelective(TTroubleTpyeVO record);

    TTroubleTpyeVO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTroubleTpyeVO record);

    int updateByPrimaryKey(TTroubleTpyeVO record);

    List<TTroubleTpyeVO> selectAll();

}
