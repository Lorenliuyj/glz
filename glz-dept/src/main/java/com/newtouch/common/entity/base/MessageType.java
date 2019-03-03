package com.newtouch.common.entity.base;

/**
 * @author lgyu
 * @date 2019/2/19 11:29
 */
public enum MessageType {

    ERROR("9999","请求异常"),
    SUCCESS("0000","请求正常"),
    ;
    private String code;

    private String msg;

    MessageType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
