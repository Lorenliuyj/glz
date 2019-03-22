package com.newtouch.glzdept.user.controller;


import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.user.entity.component.UserVO;
import com.newtouch.glzdept.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户操作 controller
 */
@RestController
@RequestMapping("user")
public class UserController {


    @Resource
    UserService userService;

    /**
     * 登录
     * @param userVO
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public ResponseVO userLogin(@RequestBody UserVO userVO){
         String backflag = userService.userLogin(userVO.getLoginName(),userVO.getPassword());
         if("0".equals(backflag)){
             return ResponseUtil.successResponse(null);
         }
        return ResponseUtil.errorResponse(null);
    }

}
