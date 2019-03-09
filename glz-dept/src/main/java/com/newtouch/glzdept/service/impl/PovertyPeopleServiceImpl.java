package com.newtouch.glzdept.service.impl;

import com.newtouch.glzdept.dao.PictureDao;
import com.newtouch.glzdept.dao.PovertyPeopleDao;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.service.PovertyPeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:27
 * project:glz-dept
 */
@Service
public class PovertyPeopleServiceImpl implements PovertyPeopleService {

    @Resource
    PovertyPeopleDao povertyPeopleDao;

    @Resource
    PictureDao pictureDao;

    @Override
    public void addPovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.insert(povertyPeopleVO);
        pictureDao.insertBatch(povertyPeopleVO.getPictures());
    }

    @Override
    public void updatePovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.updateById(povertyPeopleVO);
        pictureDao.deleteByTid(povertyPeopleVO.getId());
        pictureDao.insertBatch(povertyPeopleVO.getPictures());
    }
}
