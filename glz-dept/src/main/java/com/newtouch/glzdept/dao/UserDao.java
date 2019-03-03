package com.newtouch.glzdept.dao;
import com.newtouch.glzdept.entity.component.UserVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserDao {

    List<UserVO> userLogin(@Param("loginName") String loginName, @Param("password") String password);
}
