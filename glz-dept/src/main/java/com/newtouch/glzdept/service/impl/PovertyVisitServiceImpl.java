package com.newtouch.glzdept.service.impl;

import com.newtouch.common.entity.base.MessageType;
import com.newtouch.common.entity.base.Page;
import com.newtouch.common.exception.BlcException;
import com.newtouch.glzdept.dao.PovertyVisitDao;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.service.IPovertyVisitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class PovertyVisitServiceImpl implements IPovertyVisitService {

    @Resource
    PovertyVisitDao povertyVisitDao;

    @Override
    public void saveVisitInfo(PovertyVisitVO visitVO) {
        if(visitVO == null){
            return ;
        }
        //TODO 缺少当前用户id赋值
        visitVO.setIsdelete("n");
        visitVO.setCreateTime(new Timestamp(new Date().getTime()));
        Integer key = povertyVisitDao.insert(visitVO);
        if(key == null){
            throw new BlcException(MessageType.ERROR);
        }
    }

    @Override
    public Page<PovertyVisitVO> selectPovertyVisitPage(PovertyVisitVO povertyVisitVO, Page page) {
        page.init();
        page.setTotalNum(povertyVisitDao.total(povertyVisitVO));
        page.setList(povertyVisitDao.selectPovertyVisitPage(povertyVisitVO,page));
        return page;
    }
}
