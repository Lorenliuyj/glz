package com.newtouch.glzdept.base.entity;

import java.sql.Timestamp;

/**
 * t_trouble_tpye
 *
 * 困难类型
 *
 * date 2019年3月24日22:56:58
 * zhiliang.lan
 */

public class TroubleTpye {

    private String ID;

    private String DEPT_ID;//部门id

    private String TROUBLE_CODE;//困难编码

    private String TROUBLE_NAME;//困难类型

    private String COMMENTS;//备注

    private String CREATE_ID;//创建人

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最新更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getTROUBLE_CODE() {
        return TROUBLE_CODE;
    }

    public void setTROUBLE_CODE(String TROUBLE_CODE) {
        this.TROUBLE_CODE = TROUBLE_CODE;
    }

    public String getTROUBLE_NAME() {
        return TROUBLE_NAME;
    }

    public void setTROUBLE_NAME(String TROUBLE_NAME) {
        this.TROUBLE_NAME = TROUBLE_NAME;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public String getCREATE_ID() {
        return CREATE_ID;
    }

    public void setCREATE_ID(String CREATE_ID) {
        this.CREATE_ID = CREATE_ID;
    }

    public Timestamp getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Timestamp CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Timestamp getLAST_MODIFY_TIME() {
        return LAST_MODIFY_TIME;
    }

    public void setLAST_MODIFY_TIME(Timestamp LAST_MODIFY_TIME) {
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
    }

    public String getIS_DELETE() {
        return IS_DELETE;
    }

    public void setIS_DELETE(String IS_DELETE) {
        this.IS_DELETE = IS_DELETE;
    }

    public TroubleTpye(String ID, String DEPT_ID, String TROUBLE_CODE, String TROUBLE_NAME, String COMMENTS, String CREATE_ID, Timestamp CREATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.DEPT_ID = DEPT_ID;
        this.TROUBLE_CODE = TROUBLE_CODE;
        this.TROUBLE_NAME = TROUBLE_NAME;
        this.COMMENTS = COMMENTS;
        this.CREATE_ID = CREATE_ID;
        this.CREATE_TIME = CREATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
