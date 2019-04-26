package com.newtouch.glzdept.buss.service.impl;

import com.newtouch.common.entity.base.Page;
import com.newtouch.common.util.CommonConstants;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.buss.dao.TBussWishDAO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;
import com.newtouch.glzdept.buss.service.AppWishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppWishServiceImpl implements AppWishService {

    @Resource
    TBussWishDAO tBussWishDAO;

    @Override
    public Map selectWishCount(BaseTransCommonVO baseTransCommonVO) {
        Map<String,Object> map = new HashMap<String,Object>();
        List<TBussWishVO> list = tBussWishDAO.selectWishCount(baseTransCommonVO);
        Integer num = tBussWishDAO.selectNumByOther(CommonConstants.id);
        map.put("list",list);
        map.put("num",num);
        map.put("dpId", CommonConstants.id);
        return map;
    }

    @Override
    public Page<TBussWishVO> selectWishPage(Page page, TBussWishVO tBussWishVO) {
        page.init();
        List<TBussWishVO> list = tBussWishDAO.selectWishPage(page,tBussWishVO);
        page.setList(list);
        page.setTotalNum(tBussWishDAO.selectTotalNum(tBussWishVO));
        return page;
    }

    @Override
    public TBussWishVO selectWishById(TBussWishVO tBussWishVO) {
        return tBussWishDAO.selectByPrimaryKey(tBussWishVO.getId());
    }

    @Override
    public void updateById(TBussWishVO tBussWishVO) {
        tBussWishDAO.updateByPrimaryKeySelective(tBussWishVO);
    }
}
