package com.newtouch.glzdept.dao;

import com.newtouch.glzdept.entity.VO.PovertyVisitVO;
import org.apache.ibatis.annotations.Param;

public interface PovertyVisitDao {

    Integer insert(@Param("visitVO") PovertyVisitVO visitVO);
}
