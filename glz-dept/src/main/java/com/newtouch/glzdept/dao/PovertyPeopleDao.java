package com.newtouch.glzdept.dao;

import com.newtouch.common.entity.base.Page;
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

    //查询详细信息
    public  PovertyPeopleVO  search(@Param("id") Integer id);

    List<PovertyPeopleVO> selectPovertyPeopleVO(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO);

    /**
     *  分頁查詢
     * @param povertyPeoplePO
     * @param page
     * @return
     */
    List<PovertyPeopleVO> selectPovertyPeoplePage(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO, @Param("page") Page page);

    int total(@Param("povertyPeoplePO")PovertyPeoplePO povertyPeoplePO);


}
