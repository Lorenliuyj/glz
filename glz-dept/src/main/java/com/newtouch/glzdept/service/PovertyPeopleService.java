package com.newtouch.glzdept.service;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:26
 * project:glz-dept
 */
public interface PovertyPeopleService {

    /**
     * 新增一个贫困户信息
     * @param povertyPeopleVO
     */
    void addPovertyUser(PovertyPeopleVO povertyPeopleVO);

    /**
     * 查询贫困户信息
     * @param povertyPeopleVO
     */
    void searchPovertyUser(PovertyPeopleVO povertyPeopleVO);

    /**
     * 修改一个贫困户信息
     * @param povertyPeopleVO
     */
    void updatePovertyUser(PovertyPeopleVO povertyPeopleVO);

    /**
     * 分页查询数据
     * @param povertyPeopleVO
     * @param page
     */
    Page<PovertyPeopleVO> selectPovertyUserPage(PovertyPeopleVO povertyPeopleVO, Page page);

}
