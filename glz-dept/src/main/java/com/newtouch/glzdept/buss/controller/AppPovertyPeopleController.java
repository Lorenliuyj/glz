package com.newtouch.glzdept.buss.controller;


import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.base.service.BaseService;
import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.buss.service.AppPovertyPeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户操作 controller
 */
@Controller
@RequestMapping("poverty")
public class AppPovertyPeopleController {


    @Resource
    AppPovertyPeopleService povertyUserService;

    @Resource
    BaseService baseService;


    @PostMapping(value="/add")
    @ResponseBody
    public ResponseVO addPovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.addPovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }

    @PostMapping(value="/verif")
    @ResponseBody
    public ResponseVO verifPovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        int backflag = povertyUserService.verifPovertyUser(povertyPeopleVO);
        System.out.print(backflag);
        return ResponseUtil.successResponse(backflag);

    }

    //查询贫困户详细信息
    @GetMapping(value="/povertyInfo")
    @ResponseBody
    public ResponseVO povertyInfo(PovertyPeopleVO povertyPeopleVO,BaseTransCommonVO baseTransCommonVO){
        PovertyPeoplePO povertyInfo = povertyUserService.povertyInfo(povertyPeopleVO);
        Map<String,Object> resultMap = baseService.selectInitData(baseTransCommonVO);
        resultMap.put("vo",povertyInfo);
        return ResponseUtil.successResponse(resultMap);
    }

    //查询贫困户详细信息
    @PostMapping(value="/povertyInfoImgs")
    @ResponseBody
    public ResponseVO povertyInfoImgs(@RequestBody PovertyPeopleVO povertyPeopleVO){
        PovertyPeoplePO povertyInfo = povertyUserService.povertyInfoImgs(povertyPeopleVO);
        return ResponseUtil.successResponse(povertyInfo);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public ResponseVO updatePovertyPeople(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.updatePovertyUser(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }

    @PostMapping(value="/delete")
    @ResponseBody
    public ResponseVO delete(@RequestBody PovertyPeopleVO povertyPeopleVO){
        povertyUserService.deleteById(povertyPeopleVO);
        return ResponseUtil.successResponse(null);
    }

    /**
     * 查询列表数据
     * @param
     * @param page
     * @return
     */
    @GetMapping(value="/selectPovertyPeoplePage")
    @ResponseBody
    public ResponseVO selectPovertyPeoplePage(Page page, PovertyPeopleVO povertyPeopleVO, BaseTransCommonVO baseTransCommonVO){
        Map<String,Object> resultMap = baseService.selectInitData(baseTransCommonVO);
        if(CheckUtil.isEmpty(povertyPeopleVO.getDeptIds())) {
            povertyPeopleVO.setDeptIds(baseTransCommonVO.getBaseDeptIds());
        }
        if(CheckUtil.isEmpty(povertyPeopleVO.getVillageIds())) {
            povertyPeopleVO.setVillageIds(baseTransCommonVO.getBaseVillageIds());
        }
        Page<PovertyPeopleVO> list  =  povertyUserService.selectPovertyUserPage(povertyPeopleVO,page);
        resultMap.put("list",list);
        return ResponseUtil.successResponse(resultMap);
    }
}
