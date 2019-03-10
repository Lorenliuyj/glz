package com.newtouch.glzdept.controller;

import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import com.newtouch.glzdept.service.IPovertyVisitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("visit")
public class VisitController {

    @Resource
    IPovertyVisitService povertyVisitService;

    @PostMapping("save")
    public ResponseVO saveVisitInfo(PovertyVisitVO povertyVisitVO){
        povertyVisitService.saveVisitInfo(povertyVisitVO);
        return ResponseUtil.successResponse(null);
    }
}
