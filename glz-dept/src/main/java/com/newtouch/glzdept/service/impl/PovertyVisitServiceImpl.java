package com.newtouch.glzdept.service.impl;

import com.newtouch.common.entity.base.MessageType;
import com.newtouch.common.exception.BlcException;
import com.newtouch.glzdept.dao.PovertyVisitDao;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.service.IPovertyVisitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PovertyVisitServiceImpl implements IPovertyVisitService {

    @Resource
    PovertyVisitDao povertyVisitDao;

    @Override
    public void saveVisitInfo(PovertyVisitVO visitVO) {
        if(visitVO == null){
            return ;
        }
        Integer key = povertyVisitDao.insert(visitVO);
        if(key == null){
            throw new BlcException(MessageType.ERROR);
        }
    }
}
