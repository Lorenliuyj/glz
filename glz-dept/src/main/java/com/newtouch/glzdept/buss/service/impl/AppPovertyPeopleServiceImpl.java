package com.newtouch.glzdept.buss.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.buss.dao.PovertyPeopleDao;
import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.buss.service.AppPovertyPeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:27
 * project:glz-dept
 */
@Service
public class AppPovertyPeopleServiceImpl implements AppPovertyPeopleService {

    @Resource
    PovertyPeopleDao povertyPeopleDao;

    @Override
    public void addPovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.insert(povertyPeopleVO);
    }

    //
    @Override
    public PovertyPeoplePO povertyInfo(PovertyPeopleVO povertyPeopleVO) {
        PovertyPeoplePO result =  povertyPeopleDao.povertyInfo(povertyPeopleVO);
        return result;
    }

    @Override
    public PovertyPeoplePO povertyInfoImgs(PovertyPeopleVO povertyPeopleVO) {
        return povertyPeopleDao.povertyInfoImgs(povertyPeopleVO);
    }

    @Override
    public void updatePovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.updateById(povertyPeopleVO);
    }

    @Override
    public Page<PovertyPeopleVO> selectPovertyUserPage(PovertyPeopleVO povertyPeopleVO, Page page) {
        page.init();
        page.setTotalNum(povertyPeopleDao.total(povertyPeopleVO));
        page.setList(povertyPeopleDao.selectPovertyPeoplePage(povertyPeopleVO,page));
        return page;

    }

    @Override
    public int verifPovertyUser(PovertyPeopleVO povertyPeopleVO) {
        int result = povertyPeopleDao.selectPovertyPeopleCountByIdNo(povertyPeopleVO);
        return result;
    }

    @Override
    public void deleteById(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.deleteById(povertyPeopleVO);
    }

}
