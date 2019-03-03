package com.newtouch.common.entity.base;


/**
 * @author lgyu
 * @date 2019/2/19 11:44
 */
public class ResponseVO<T> {

    private String code;

    private String msg;

    private T result;

    public ResponseVO(String code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
