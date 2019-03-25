package com.newtouch.glzdept.permission.entity;

import java.sql.Timestamp;

/**
 *  角色表  t_role
 * date 2019年3月24日22:14:08
 * zhiliang.lan
 */
public class RoleVO {

    private String ID;//id

    private String ROLE_NAME;//角色名称

    private String COMMENTS;//备注

    private String CREATE_ID;//创建人

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最后更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public String getROLE_NAME() {
        return ROLE_NAME;
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

    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME;
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

    public RoleVO() {
    }

    public RoleVO(String ID, String ROLE_NAME, String COMMENTS, String CREATE_ID, Timestamp CREATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.ROLE_NAME = ROLE_NAME;
        this.COMMENTS = COMMENTS;
        this.CREATE_ID = CREATE_ID;
        this.CREATE_TIME = CREATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
