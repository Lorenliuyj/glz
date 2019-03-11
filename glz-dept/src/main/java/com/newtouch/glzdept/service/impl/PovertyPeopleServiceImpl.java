package com.newtouch.glzdept.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.dao.PovertyPeopleDao;
import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.service.PovertyPeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    public void updatePovertyUser(PovertyPeopleVO povertyPeopleVO) {
        povertyPeopleDao.updateById(povertyPeopleVO);
    }

    @Override
    public Page<PovertyPeopleVO> selectPovertyUserPage(PovertyPeopleVO povertyPeopleVO, Page page) {
        if(page == null){
            page.init();
        }
        Map<String,PovertyPeopleVO> map = new HashMap<String,PovertyPeopleVO>();
        if(povertyPeopleVO == null){
             povertyPeopleVO =new PovertyPeopleVO();
        }
        map.put("povertyPeopleVO",povertyPeopleVO);
        page.setTotalNum(povertyPeopleDao.total(map));
        page.setList(povertyPeopleDao.selectPovertyPeoplePage(povertyPeopleVO,page));
        return page;

    }

}
