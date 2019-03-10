package com.newtouch.common.util;

import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.entity.base.MessageType;

/**
 * 响应页面请求相关工具类
 * @author lgyu
 * @date 2019/2/19 13:20
 */
public class ResponseUtil {


    /**
     * 获取页面响应VO
     * @param type      返回类型
     * @param result    返回结果
     * @param <T>       返回数据类型
     * @return
     */
    public static <T> ResponseVO getResponseVO(MessageType type, T result){
        return new ResponseVO(type.getCode(), type.getMsg(), result);
    }

    /**
     * 正常响应组装VO
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseVO successResponse(T data){
        return  getResponseVO(MessageType.SUCCESS, data);
    }

    /**
     * 异常响应组装VO
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseVO errorResponse(T data){
        return  getResponseVO(MessageType.ERROR, data);
    }

}
