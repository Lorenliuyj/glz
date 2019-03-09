package com.newtouch.glzdept.controller;


import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.service.PovertyPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户操作 controller
 */
@Controller
@RequestMapping("poverty")
public class PovertyPeopleController {


    @Autowired
    PovertyPeopleService povertyUserService;


    @RequestMapping(value="/add",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO addPovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.addPovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }


    @RequestMapping(value="/update",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO updatePovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.updatePovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }
}
