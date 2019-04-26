package com.newtouch.glzdept.buss.controller;

import com.newtouch.common.entity.base.Page;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.buss.entity.VO.TBussWishVO;
import com.newtouch.glzdept.buss.service.AppWishService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("buss/wish")
public class AppWishController {

    @Resource
    AppWishService appWishService;

    @PostMapping(value="/selectWishCount")
    @ResponseBody
    public ResponseVO selectWishCount(@RequestBody BaseTransCommonVO baseTransCommonVO) {

        Map map = appWishService.selectWishCount(baseTransCommonVO);

        return ResponseUtil.successResponse(map);
    }

    @GetMapping(value="/selectWishPage")
    @ResponseBody
    public ResponseVO selectWishPage (Page page, TBussWishVO tBussWishVO) {
        Map<String,Object> map = new HashMap<String,Object>();
        Page<TBussWishVO> list = appWishService.selectWishPage(page,tBussWishVO);
        map.put("list",list);
        return ResponseUtil.successResponse(map);
    }

    @PostMapping(value="/selectWishById")
    @ResponseBody
    public ResponseVO selectWishById(@RequestBody TBussWishVO tBussWishVO) {

        TBussWishVO VO = appWishService.selectWishById(tBussWishVO);

        return ResponseUtil.successResponse(VO);
    }

    @PostMapping(value="/updateById")
    @ResponseBody
    public ResponseVO updateById(@RequestBody TBussWishVO tBussWishVO) {
        appWishService.updateById(tBussWishVO);
        return ResponseUtil.successResponse(null);
    }

}
