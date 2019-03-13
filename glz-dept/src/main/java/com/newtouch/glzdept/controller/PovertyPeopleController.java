package com.newtouch.glzdept.controller;


import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.entity.PO.PovertyPeoplePO;
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

    //查询贫困户详细信息
    @RequestMapping(value="/povertyInfo",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO povertyInfo(@RequestBody PovertyPeopleVO povertyPeopleVO){
        PovertyPeoplePO  povertyInfo = povertyUserService.povertyInfo(povertyPeopleVO);
        return ResponseUtil.successResponse(povertyInfo);
    }

    //查询贫困户详细信息
    @PostMapping(value="/povertyInfoImgs")
    @ResponseBody
    public ResponseVO povertyInfoImgs(@RequestBody PovertyPeopleVO povertyPeopleVO){
        PovertyPeoplePO  povertyInfo = povertyUserService.povertyInfoImgs(povertyPeopleVO);
        return ResponseUtil.successResponse(povertyInfo);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public ResponseVO updatePovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.updatePovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }

    /**
     * 查询列表数据
     * @param
     * @param page
     * @return
     */
    @PostMapping(value="/selectPovertyPeoplePage")
    @ResponseBody
    public ResponseVO selectPovertyPeoplePage(@RequestBody Page page){
        Page<PovertyPeopleVO> list  =  povertyUserService.selectPovertyUserPage(page.getPovertyPeopleVO(),page);
        return ResponseUtil.successResponse(list);
    }
}
