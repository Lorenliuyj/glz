package com.newtouch.glzdept.permission.entity;

import java.sql.Timestamp;

/**
 *  用户角色表
 *
 * t_user_role
 * date 2019年3月24日22:37:51
 * zhiliang.lan
 */

public class UserRoleVO {

    private String ID;//id

    private String USER_ID;//用户id

    private String ROLE_ID;//角色id

    private String COMMENTS;//备注

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最新更新时间

    private String IS_DELETE;//删除标志



    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
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

    public String getID() {
        return ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public String getCOMMENTS() {
        return COMMENTS;
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

    public UserRoleVO(String ID, String USER_ID, String ROLE_ID, String COMMENTS, Timestamp CREATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.ROLE_ID = ROLE_ID;
        this.COMMENTS = COMMENTS;
        this.CREATE_TIME = CREATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
