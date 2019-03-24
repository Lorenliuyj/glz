package com.newtouch.glzdept.permission.entity;

import java.sql.Timestamp;

/**
 *  功能表
 * t_func
 * 2019年3月24日22:30:20
 * zhiliang.lan
 */

public class FuncVO {

    private String ID;//id

    private String PARANT_ID;//父id

    private String FUNC_CODE;//功能编号

    private String FUNC_NAME;//功能名称

    private String FUNC_STATUS;//功能状态

    private String CREATE_ID;//创建人id

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最新更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public String getPARANT_ID() {
        return PARANT_ID;
    }

    public String getFUNC_CODE() {
        return FUNC_CODE;
    }

    public String getFUNC_NAME() {
        return FUNC_NAME;
    }

    public String getFUNC_STATUS() {
        return FUNC_STATUS;
    }

    public String getCREATE_ID() {
        return CREATE_ID;
    }

    public Timestamp getCREATE_TIME() {
        return CREATE_TIME;
    }

    public Timestamp getLAST_MODIFY_TIME() {
        return LAST_MODIFY_TIME;
    }

    public String getIS_DELETE() {
        return IS_DELETE;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPARANT_ID(String PARANT_ID) {
        this.PARANT_ID = PARANT_ID;
    }

    public void setFUNC_CODE(String FUNC_CODE) {
        this.FUNC_CODE = FUNC_CODE;
    }

    public void setFUNC_NAME(String FUNC_NAME) {
        this.FUNC_NAME = FUNC_NAME;
    }

    public void setFUNC_STATUS(String FUNC_STATUS) {
        this.FUNC_STATUS = FUNC_STATUS;
    }

    public void setCREATE_ID(String CREATE_ID) {
        this.CREATE_ID = CREATE_ID;
    }

    public void setCREATE_TIME(Timestamp CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public void setLAST_MODIFY_TIME(Timestamp LAST_MODIFY_TIME) {
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
    }

    public void setIS_DELETE(String IS_DELETE) {
        this.IS_DELETE = IS_DELETE;
    }

    public FuncVO(String ID, String PARANT_ID, String FUNC_CODE, String FUNC_NAME, String FUNC_STATUS, String CREATE_ID, Timestamp CREATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.PARANT_ID = PARANT_ID;
        this.FUNC_CODE = FUNC_CODE;
        this.FUNC_NAME = FUNC_NAME;
        this.FUNC_STATUS = FUNC_STATUS;
        this.CREATE_ID = CREATE_ID;
        this.CREATE_TIME = CREATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
