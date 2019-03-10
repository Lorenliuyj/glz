package com.newtouch.glzdept.controller;


import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.service.PovertyPeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户操作 controller
 */
@Controller
@RequestMapping("poverty")
public class PovertyPeopleController {


    @Resource
    PovertyPeopleService povertyUserService;


    @PostMapping(value="/add")
    @ResponseBody
    public ResponseVO addPovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.addPovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }


    @PostMapping(value="/update")
    @ResponseBody
    public ResponseVO updatePovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.updatePovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }

    /**
     * 查询列表数据
     * @param povertyPeopleVO
     * @param page
     * @return
     */
    @PostMapping(value="/selectPovertyPeoplePage")
    @ResponseBody
    public ResponseVO selectPovertyPeoplePage(@RequestBody PovertyPeopleVO povertyPeopleVO,Page page){
        Page<PovertyPeopleVO> list  =  povertyUserService.selectPovertyUserPage(povertyPeopleVO,page);
        return ResponseUtil.successResponse(list);
    }
}
