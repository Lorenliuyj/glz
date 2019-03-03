package com.newtouch.common.hanldle;

import com.newtouch.common.entity.base.MessageType;
import com.newtouch.common.entity.base.ResponseVO;
import com.newtouch.common.exception.BlcException;
import com.newtouch.common.util.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理
 * @author lgyu
 * @date 2019/2/19 14:10
 */
@ControllerAdvice
public class ExceptionHandle  {

    @ExceptionHandler(BlcException.class)
    @ResponseBody
    public ResponseVO blcExceptionHandle(BlcException e){
        return ResponseUtil.getResponseVO(e.getType(),e.getCause().getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseVO exceptionHandle(Exception e){
        return ResponseUtil.getResponseVO(MessageType.ERROR,e.getMessage());
    }

}
