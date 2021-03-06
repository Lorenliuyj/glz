package com.newtouch.glzdept.buss.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.glzdept.buss.dao.PovertyPeopleDao;
import com.newtouch.glzdept.buss.dao.TBussWishDAO;
import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;
import com.newtouch.glzdept.buss.service.AppPovertyPeopleService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:27
 * project:glz-dept
 */
@Service
public class AppPovertyPeopleServiceImpl implements AppPovertyPeopleService {

    @Resource
    PovertyPeopleDao povertyPeopleDao;

    @Resource
    TBussWishDAO tBussWishDAO;

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
        List<PovertyPeopleVO> list = povertyPeopleDao.selectPovertyPeoplePage(povertyPeopleVO,page);
        List<TBussWishVO> tlist = tBussWishDAO.selectWishCountByPid(povertyPeopleVO);
        for(PovertyPeoplePO pvo : list) {
            for(TBussWishVO tvo : tlist) {
                if(pvo.getId().equals(Long.toString(tvo.getPovertyPeopleId()))) {
                    pvo.settSum(tvo.gettSum());
                }
            }
        }
        Collections.sort(list, new Comparator<PovertyPeoplePO>() {
            @Override
            public int compare(PovertyPeoplePO o1, PovertyPeoplePO o2) {
                String num1 = o1.gettSum()==null?"0":o1.gettSum();
                String num2 = o2.gettSum()==null?"0":o2.gettSum();

                    return num2.compareTo(num1);

            }
        });


        page.setTotalNum(povertyPeopleDao.total(povertyPeopleVO));
        page.setList(list);
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
