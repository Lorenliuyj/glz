package com.newtouch.glzdept.user.dao;

import com.newtouch.glzdept.user.entity.component.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<UserVO> userLogin(@Param("loginName") String loginName, @Param("password") String password);
}
