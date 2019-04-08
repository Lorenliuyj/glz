package com.newtouch.glzdept.buss.service.impl;

import com.newtouch.common.entity.base.MessageType;
import com.newtouch.common.entity.base.Page;
import com.newtouch.common.exception.BlcException;
import com.newtouch.glzdept.buss.dao.PovertyVisitDao;
import com.newtouch.glzdept.buss.dao.TBussWishDAO;
import com.newtouch.glzdept.buss.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;
import com.newtouch.glzdept.buss.service.AppPovertyVisitService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

@Service
public class AppPovertyVisitServiceImpl implements AppPovertyVisitService {

    @Resource
    PovertyVisitDao povertyVisitDao;

    @Resource
    TBussWishDAO tBussWishDAO;

    @Override
    @Transactional(value="txManager")
    public void saveVisitInfo(PovertyVisitVO visitVO) {
        if(visitVO == null){
            return ;
        }
        //TODO 缺少当前用户id赋值
        visitVO.setIsdelete("n");
        povertyVisitDao.insert(visitVO);
        TBussWishVO tBussWishVO = visitVO.gettBussWishVO();
        tBussWishVO.setMakePovertyVisitId(Long.valueOf(visitVO.getId()));
        tBussWishDAO.insert(tBussWishVO);
    }

    @Override
    public Page<PovertyVisitVO> selectPovertyVisitPage(PovertyVisitVO povertyVisitVO, Page page) {
        page.init();
        page.setTotalNum(povertyVisitDao.total(povertyVisitVO));
        page.setList(povertyVisitDao.selectPovertyVisitPage(povertyVisitVO,page));
        return page;
    }

    @Override
    public PovertyVisitVO visitInfo(PovertyVisitVO povertyVisitVO) {
        return povertyVisitDao.visitInfo(povertyVisitVO);
    }

    @Override
    public PovertyVisitVO visitInfoImgs(PovertyVisitVO povertyVisitVO) {
        return povertyVisitDao.visitInfoImgs(povertyVisitVO);
    }

    @Override
    public void updateById(PovertyVisitVO povertyVisitVO) {
        povertyVisitDao.updateById(povertyVisitVO);
    }

}
