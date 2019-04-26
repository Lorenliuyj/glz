package com.newtouch.glzdept.user.controller;


import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.user.entity.VO.TUserVO;
import com.newtouch.glzdept.user.service.AppUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 用户操作 controller
 */
@RestController
@RequestMapping("user")
public class AppUserController {


    @Resource
    AppUserService appUserService;

    /**
     * 登录 测试更改 再测试
     * @param userVO
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO userLogin(@RequestBody TUserVO userVO){
        Map<String,Object> resultMap = appUserService.userLogin(userVO);
        if(!CheckUtil.isEmpty(resultMap)) {
            //成功
            return ResponseUtil.successResponse(resultMap);
        }
        return ResponseUtil.errorResponse(null);
    }

    /**
     * 查询个人信息
     * @param userVO
     * @return
     */
    @RequestMapping(value="/selectUserInfo",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO selectUserInfo(@RequestBody TUserVO userVO) {
        TUserVO user = appUserService.selectUserInfo(userVO);
        return ResponseUtil.successResponse(user);
    }

}
