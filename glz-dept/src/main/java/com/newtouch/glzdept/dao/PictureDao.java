package com.newtouch.glzdept.dao;

import com.newtouch.glzdept.entity.PO.PicturePO;
import com.newtouch.glzdept.entity.VO.PictureVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午5:18
 * project:glz-dept
 */
public interface PictureDao {
    /**
     * 插入一条图片数据
     * @param picturePO
     */
    void insert(@Param("picturePO") PicturePO picturePO);

    /**
     * 插入多张图片数据
     * @param pictures
     */
    void insertBatch(@Param("pictures") List<PictureVO> pictures);

    /**
     * 通过图片id删除图片
     * @param id
     */
    void deleteById(@Param("id")String id);

    /**
     * 通过贫困人id删除图片
     * @param tid 贫困人id
     */
    void deleteByTid(@Param("tid")String tid);


    /**
     * 修改图片信息
     * @param picturePO
     */
    void updateById(@Param("picturePO")PicturePO picturePO);

    /**
     * 根据传入条件查询
     * @param picturePO
     * @return
     */
    List<PictureVO> select(@Param("picturePO")PicturePO picturePO);

    /**
     * 通过贫困户id查询数据
     * @param povertyId
     * @return
     */
    List<PictureVO> selectByTid(@Param("tid") String povertyId);
}
