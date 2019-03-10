package com.newtouch.glzdept.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.dao.PovertyPeopleDao;
import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;
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
    public PovertyPeopleVO searchPovertyPeople(PovertyPeopleVO povertyPeopleVO) {
        PovertyPeoplePO result =  povertyPeopleDao.search(povertyPeopleVO);
        System.out.println("转换成VO前*************************************************");
        System.out.println(result);
        PovertyPeopleVO aad = new PovertyPeopleVO();
        aad.setVillage(result.getVillage());
        aad.setPovertyName(result.getPovertyName());
        aad.setAddress(result.getAddress());
        aad.setBirthday(result.getBirthday());
        aad.setComments(result.getComments());
        aad.setDifficultTypeId(result.getDifficultTypeId());
        aad.setFamilyDetail(result.getFamilyDetail());
        aad.setId(result.getId());
        aad.setIdcardNo(result.getIdcardNo());
        aad.setImage1(result.getImage1());
        aad.setImage2(result.getImage2());
        aad.setImage3(result.getImage3());
        aad.setIncome(result.getIncome());
        aad.setPhone(result.getPhone());
        aad.setPovertyType1(result.getPovertyType1());
        aad.setPovertyType2(result.getPovertyType2());
        aad.setSex(result.getSex());
        aad.setTrouble(result.getTrouble());
        System.out.println("转换成VO后*************************************************");
        System.out.println(aad);
        return aad;
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
