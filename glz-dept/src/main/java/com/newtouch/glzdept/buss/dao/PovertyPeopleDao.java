package com.newtouch.glzdept.buss.dao;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:32
 * project:glz-dept
 */
public interface PovertyPeopleDao {

    void insert(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);

    void insertBatch(@Param("PovertyPeopleObj") List<PovertyPeoplePO> povertyPeoples);

    void deleteById(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);

    void updateById(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);

    //查询详细信息
    PovertyPeoplePO povertyInfo(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);

    PovertyPeoplePO povertyInfoImgs(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);

    List<PovertyPeopleVO> selectPovertyPeopleVO(@Param("PovertyPeopleObj") PovertyPeoplePO povertyPeoplePO);
    /**
     *  分頁查詢d
     * @param povertyPeopleVO
     * @param page
     * @return
     */
    List<PovertyPeopleVO> selectPovertyPeoplePage(@Param("PovertyPeopleObj") PovertyPeopleVO povertyPeopleVO, @Param("page") Page page);

    int total(@Param("PovertyPeopleObj") PovertyPeopleVO povertyPeopleVO);

    int selectPovertyPeopleCountByIdNo(@Param("PovertyPeopleObj") PovertyPeopleVO povertyPeopleVO);
}
