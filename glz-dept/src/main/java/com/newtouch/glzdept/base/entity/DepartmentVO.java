package com.newtouch.glzdept.base.entity;

import java.sql.Timestamp;

/**
 *  部门表
 * date 2019年3月24日21:40:58
 * t_department
 */
public class DepartmentVO {

    private String ID;//ID
    private String DEPT_NAME;//部门名称，一级类型

    private String DEPT_CODE;//部门编码

    private String DEPT_CHARGE;//管理人

    private String COMMENTS;//备注

    private String CREATE_ID;//创建人

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最后更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public String getDEPT_NAME() {
        return DEPT_NAME;
    }

    public String getDEPT_CODE() {
        return DEPT_CODE;
    }

    public String getDEPT_CHARGE() {
        return DEPT_CHARGE;
    }

    public String getCOMMENTS() {
        return COMMENTS;
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

    public void setDEPT_NAME(String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }

    public void setDEPT_CODE(String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    public void setDEPT_CHARGE(String DEPT_CHARGE) {
        this.DEPT_CHARGE = DEPT_CHARGE;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
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
}
