package com.newtouch.common.exception;

import com.newtouch.common.entity.base.MessageType;

/**
 * 项目自定义业务异常类
 * @author lgyu
 * @date 2019/2/19 11:27
 */
public class BlcException extends RuntimeException{

    private MessageType type;

    public BlcException(MessageType type) {
        super(type.getMsg());
        this.type = type;
    }

    public BlcException(MessageType type, Throwable cause) {
        super(type.getMsg(), cause);
        this.type = type;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
