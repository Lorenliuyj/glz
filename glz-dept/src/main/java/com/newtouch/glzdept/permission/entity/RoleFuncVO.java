package com.newtouch.glzdept.permission.entity;


import java.sql.Timestamp;

/**
 *
 * 角色功能表
 * t_role_func
 * date 2019年3月24日22:45:43
 * zhiliang.lan
 */

public class RoleFuncVO {

    private String ID;//

    private String ROLE_ID;//角色

    private String FUNC_ID;//功能id

    private String CREATE_ID;//创建人

    private Timestamp CRERATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最新更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public String getFUNC_ID() {
        return FUNC_ID;
    }

    public void setFUNC_ID(String FUNC_ID) {
        this.FUNC_ID = FUNC_ID;
    }

    public String getCREATE_ID() {
        return CREATE_ID;
    }

    public void setCREATE_ID(String CREATE_ID) {
        this.CREATE_ID = CREATE_ID;
    }

    public Timestamp getCRERATE_TIME() {
        return CRERATE_TIME;
    }

    public void setCRERATE_TIME(Timestamp CRERATE_TIME) {
        this.CRERATE_TIME = CRERATE_TIME;
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

    public RoleFuncVO(String ID, String ROLE_ID, String FUNC_ID, String CREATE_ID, Timestamp CRERATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.ROLE_ID = ROLE_ID;
        this.FUNC_ID = FUNC_ID;
        this.CREATE_ID = CREATE_ID;
        this.CRERATE_TIME = CRERATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
