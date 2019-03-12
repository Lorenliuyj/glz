package com.newtouch.glzdept.controller;

import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.entity.VO.PovertyPeopleVO;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.service.IPovertyVisitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("visit")
public class VisitController {

    @Resource
    IPovertyVisitService povertyVisitService;

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
    @PostMapping(value="/selectvisitPage")
    @ResponseBody
    public ResponseVO selectVisitPage(@RequestBody Page page){
        Page<PovertyVisitVO> list  =  povertyVisitService.selectPovertyVisitPage(page.getPovertyVisitVO(),page);
        return ResponseUtil.successResponse(list);
    }
}
