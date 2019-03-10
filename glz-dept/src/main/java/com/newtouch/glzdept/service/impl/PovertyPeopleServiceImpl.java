package com.newtouch.glzdept.service.impl;

import com.newtouch.common.entity.base.Page;
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

    @Override
    public void addPovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.insert(povertyPeopleVO);
    }

    //
    @Override
    public  PovertyPeopleVO searchPovertyPeople(PovertyPeopleVO povertyPeopleVO) {
        Integer id = Integer.parseInt(povertyPeopleVO.getId());
        PovertyPeopleVO result = povertyPeopleDao.search(id);
        return result;
    }

    @Override
    public void updatePovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.updateById(povertyPeopleVO);
    }

    @Override
    public Page<PovertyPeopleVO> selectPovertyUserPage(PovertyPeopleVO povertyPeopleVO, Page page) {
        if(page == null){
            page.init();
        }
        page.setTotalNum(povertyPeopleDao.total(povertyPeopleVO));
        page.setList(povertyPeopleDao.selectPovertyPeoplePage(povertyPeopleVO,page));
        return page;

    }

}
