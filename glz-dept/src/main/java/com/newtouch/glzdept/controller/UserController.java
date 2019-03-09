package com.newtouch.glzdept.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.newtouch.glzdept.entity.component.UserVO;
import com.newtouch.glzdept.service.UserService;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
     * @param userJosnString
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public String userLogin(@RequestBody UserVO userVO){
        return userService.userLogin(userVO.getLoginName(),userVO.getPassword());
    }

}
