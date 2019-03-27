package com.newtouch.glzdept.buss.controller;

import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.base.service.BaseService;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.buss.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.buss.service.AppPovertyVisitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("visit")
public class AppVisitController {

    @Resource
    AppPovertyVisitService povertyVisitService;

    @Resource
    BaseService baseService;

    @PostMapping("save")
    public ResponseVO saveVisitInfo( @RequestBody PovertyVisitVO povertyVisitVO){
        povertyVisitService.saveVisitInfo(povertyVisitVO);
        return ResponseUtil.successResponse(null);
    }

    /**
     * 查询列表数据
     * @param
     * @param page
     * @return
     */
    @GetMapping(value="/selectvisitPage")
    @ResponseBody
    public ResponseVO selectVisitPage(Page page, PovertyVisitVO povertyVisitVO, BaseTransCommonVO baseTransCommonVO){
        Map<String,Object> resultMap = baseService.selectInitData(baseTransCommonVO);
        Page<PovertyVisitVO> list  =  povertyVisitService.selectPovertyVisitPage(povertyVisitVO,page);
        if(CheckUtil.isEmpty(povertyVisitVO.getVillages())) {
            povertyVisitVO.setVillages(baseTransCommonVO.getBaseVillageIds());
        }
        resultMap.put("list",list);
        return ResponseUtil.successResponse(resultMap);
    }

    @PostMapping(value="/visitInfo")
    @ResponseBody
    public ResponseVO visitInfo(@RequestBody PovertyVisitVO povertyVisitVO){
        PovertyVisitVO resultVO  =  povertyVisitService.visitInfo(povertyVisitVO);
        return ResponseUtil.successResponse(resultVO);
    }

    @PostMapping(value="/visitInfoImgs")
    @ResponseBody
    public ResponseVO visitInfoImgs(@RequestBody PovertyVisitVO povertyVisitVO){
        PovertyVisitVO resultVO  =  povertyVisitService.visitInfoImgs(povertyVisitVO);
        return ResponseUtil.successResponse(resultVO);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public ResponseVO updateById(@RequestBody PovertyVisitVO povertyVisitVO){
        povertyVisitService.updateById(povertyVisitVO);
        return ResponseUtil.successResponse(null);
    }

}
