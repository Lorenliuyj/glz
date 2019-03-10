package com.newtouch.glzdept.service.impl;


import com.newtouch.common.entity.base.MessageType;
import com.newtouch.common.util.ResponseUtil;
import com.newtouch.glzdept.dao.UserDao;
import com.newtouch.glzdept.entity.component.UserVO;
import com.newtouch.glzdept.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public String userLogin(String loginName, String password) {
        List<UserVO> userList = userDao.userLogin(loginName,password);
        if(userList.size() < 1){
            return "1"; //用户未查询到
        }else if (userList.size() > 1){
            return "2"; //用户维护错误
        }
        return "0"; //正常登录
    }

}
