package com.newtouch.glzdept.base.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.newtouch.common.util.CheckUtil;
import com.newtouch.glzdept.base.dao.TDepartmentDAO;
import com.newtouch.glzdept.base.dao.TTroubleTpyeDAO;
import com.newtouch.glzdept.base.dao.TVillageDAO;
import com.newtouch.glzdept.base.entity.VO.TDepartmentVO;
import com.newtouch.glzdept.base.entity.VO.TTroubleTpyeVO;
import com.newtouch.glzdept.base.entity.VO.TVillageVO;
import com.newtouch.glzdept.base.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 基础数据实现类
 * date 2019年3月24日22:51:07
 * zhiliang.lan
 */

@Service
public class BaseServiceImpl implements BaseService {

    @Resource
    TDepartmentDAO tDepartmentDAO;

    @Resource
    TTroubleTpyeDAO tTroubleTpyeDAO;

    @Resource
    TVillageDAO tVillageDAO;

    @Override
    public Map<String, Object> selectDeptTroubleByIds(List<String> list) {
        List<TDepartmentVO> dlist = tDepartmentDAO.selectDeptTroubleByIds(list);
        List<TTroubleTpyeVO> tlist = tTroubleTpyeDAO.selectAll();

        if(CheckUtil.isEmpty(dlist)) {
            return null;
        }
        JSONArray jsonArray = new JSONArray();
        Map<String,Object> resultMap = new HashMap<String,Object>();
        for(TDepartmentVO dVO : dlist) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",dVO.getId());
            jsonObject.put("text",dVO.getDeptName());
            jsonObject.put("value",dVO.getDeptCode());
            JSONArray jsonArray1 = new JSONArray();
            for(TTroubleTpyeVO tVO : tlist) {
                JSONObject jsonObject1 = new JSONObject();
                if(dVO.getId().equals(tVO.getDeptId())) {
                    jsonObject1.put("id",tVO.getId());
                    jsonObject1.put("text",tVO.getTroubleName());
                    jsonObject1.put("value",tVO.getTroubleCode());
                    jsonArray1.add(jsonObject1);
                }
            }
            if(jsonArray1.size()>0) {
                jsonObject.put("children",jsonArray1);
            }
            jsonArray.add(jsonObject);
        }
        resultMap.put("depts",jsonArray);
        return resultMap;
    }

    @Override
    public Map<String, Object> selectVillageByIds(List<String> list) {
        List<TVillageVO> tlist = tVillageDAO.selectVillageByIds(list);
        if(CheckUtil.isEmpty(tlist)) {
            return null;
        }
        Map<String,Object> resultMap = new HashMap<String,Object>();
        JSONArray jsonArray = new JSONArray();
        for(TVillageVO vo : tlist) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",vo.getId());
            jsonObject.put("text",vo.getName());
            jsonObject.put("value",vo.getCode());
            jsonArray.add(jsonObject);
        }
        resultMap.put("villages",jsonArray);
        return resultMap;
    }
}
