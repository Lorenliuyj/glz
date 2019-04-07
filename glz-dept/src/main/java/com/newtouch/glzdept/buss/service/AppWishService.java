package com.newtouch.glzdept.buss.service;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;

import java.util.List;

public interface AppWishService {
    List<TBussWishVO> selectWishCount(BaseTransCommonVO baseTransCommonVO);

    Page<TBussWishVO> selectWishPage(Page page, TBussWishVO tBussWishVO);

    TBussWishVO selectWishById(TBussWishVO tBussWishVO);

    void updateById(TBussWishVO tBussWishVO);
}
