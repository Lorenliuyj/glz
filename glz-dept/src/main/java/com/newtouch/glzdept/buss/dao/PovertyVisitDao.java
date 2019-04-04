package com.newtouch.glzdept.buss.dao;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.buss.entity.VO.PovertyVisitVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PovertyVisitDao {

    Long insert(@Param("visitVO") PovertyVisitVO visitVO);

    /**
     *  分頁查詢
     * @param
     * @param page
     * @return
     */
    List<PovertyVisitVO> selectPovertyVisitPage(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO, @Param("page") Page page);

    int total(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO);

    PovertyVisitVO visitInfo(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO);

    PovertyVisitVO visitInfoImgs(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO);

    void updateById(@Param("povertyVisitVO") PovertyVisitVO povertyVisitVO);
}

