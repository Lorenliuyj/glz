package com.newtouch.glzdept.bss.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.bss.dao.PovertyPeopleDao;
import com.newtouch.glzdept.bss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.bss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.bss.service.PovertyPeopleService;
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
