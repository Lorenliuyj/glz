package com.newtouch.glzdept.base.service;

import com.newtouch.glzdept.base.entity.VO.TVillageVO;

import java.util.List;
import java.util.Map;

/**
 *
 * 基础数据接口类
 * date 2019年3月24日22:54:04
 * zhiliang.lan
 */

public interface BaseService {

    Map<String,Object> selectDeptTroubleByIds(List<String> list);

    Map<String, Object> selectVillageByIds(List<String> list);
}
