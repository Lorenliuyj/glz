package com.newtouch.glzdept.buss.service;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.buss.entity.VO.PovertyVisitVO;

public interface IPovertyVisitService {

    void saveVisitInfo(PovertyVisitVO visitVO);

    /**
     * 分页查询数据
     * @param povertyVisitVO
     * @param page
     */
    Page<PovertyVisitVO> selectPovertyVisitPage(PovertyVisitVO povertyVisitVO, Page page);

    PovertyVisitVO visitInfo(PovertyVisitVO povertyVisitVO);

    PovertyVisitVO visitInfoImgs(PovertyVisitVO povertyVisitVO);

    void updateById(PovertyVisitVO povertyVisitVO);
}
