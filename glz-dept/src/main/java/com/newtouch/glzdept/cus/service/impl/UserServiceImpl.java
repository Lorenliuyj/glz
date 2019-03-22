package com.newtouch.glzdept.cus.service.impl;


import com.newtouch.glzdept.cus.dao.UserDao;
import com.newtouch.glzdept.cus.entity.component.UserVO;
import com.newtouch.glzdept.cus.service.UserService;
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
