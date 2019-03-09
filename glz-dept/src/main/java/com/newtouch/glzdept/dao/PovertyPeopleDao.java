package com.newtouch.glzdept.dao;

import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:32
 * project:glz-dept
 */
public interface PovertyPeopleDao {

    void insert(@Param("povertyPeoplePO") PovertyPeoplePO povertyPeoplePO);

    void insertBatch (@Param("povertyPeoples") List<PovertyPeoplePO> povertyPeoples);

    void deleteById(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO);

    void updateById(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO);

    List<PovertyPeopleVO> selectPovertyPeopleVO(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO);
}
