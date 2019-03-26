package com.newtouch.glzdept.user.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.glzdept.user.dao.UserDao;
import com.newtouch.glzdept.user.entity.VO.TUserVO;
import com.newtouch.glzdept.user.service.AppUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Resource
    UserDao userDao;

    @Override
    public Map<String,Object> userLogin(TUserVO userVO) {
        List<TUserVO> userlist = userDao.userLogin(userVO);
        if(CheckUtil.isEmpty(userlist) || userlist.size() > 1) {
            return null;
        }
        TUserVO user = userlist.get(0);
        Long id = user.getId();
        Map<String,Object> resultMap = new HashMap<String,Object>();
        List<TUserVO> dlist = userDao.selectDeptById(id);
        List<TUserVO> vlist = userDao.selectVillageById(id);
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray1 = new JSONArray();
        for(TUserVO vo : dlist) {
            if(id.equals(vo.getId())) {
                JSONObject jsonObject = new JSONObject();
                Long deptId = vo.getDeptId();
                String deptName = vo.getDeptName();
                String deptCode = vo.getDeptCode();
                jsonObject.put("id",deptId);
                jsonObject.put("deptName",deptName);
                jsonObject.put("deptCode",deptCode);
                jsonArray.add(jsonObject);
            }
        }
        for(TUserVO vo : vlist) {
            if(id.equals(vo.getId())) {
                JSONObject jsonObject = new JSONObject();
                Long villageId = vo.getId();
                String name = vo.getVillageName();
                String code = vo.getVillageCode();
                jsonObject.put("id",villageId);
                jsonObject.put("villageName",name);
                jsonObject.put("villageCode",code);
                jsonArray1.add(jsonObject);
            }
        }
        resultMap.put("user",user);
        resultMap.put("dept",jsonArray);
        resultMap.put("village",jsonArray1);
        return resultMap;
    }


}
