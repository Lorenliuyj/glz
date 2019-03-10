package com.newtouch.glzdept.dao;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PovertyVisitDao {

    Integer insert(@Param("visitVO") PovertyVisitVO visitVO);

    /**
     *  分頁查詢
     * @param
     * @param page
     * @return
     */
    List<PovertyVisitVO> selectPovertyVisitPage(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO, @Param("page") Page page);

}

