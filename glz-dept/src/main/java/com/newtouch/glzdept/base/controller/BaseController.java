package com.newtouch.glzdept.base.controller;

import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.base.entity.base.BaseTransCommonVO;
import com.newtouch.glzdept.base.service.BaseService;
import com.newtouch.glzdept.user.entity.VO.TUserVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 基础
 *
 * date 2019年3月24日23:06:42
 * zhiliang.lan
 */

@RestController
@RequestMapping("base")
public class BaseController {

    @Resource
    BaseService baseService;

    @RequestMapping(value="/selectInitData",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO selectInitData(@RequestBody BaseTransCommonVO baseTransCommonVO){
        Map<String,Object> resultMap = baseService.selectInitData(baseTransCommonVO);
        return ResponseUtil.successResponse(resultMap);
    }

}
