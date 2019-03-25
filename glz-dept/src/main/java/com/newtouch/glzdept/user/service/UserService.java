package com.newtouch.glzdept.user.service;

import com.newtouch.glzdept.user.entity.VO.TUserVO;

import java.util.Map;

public interface UserService {

    Map<String,Object> userLogin(TUserVO userVO);
}
