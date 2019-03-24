package com.newtouch.glzdept.base.entity;


import java.sql.Timestamp;

/**
 *
 * 村落表
 * date 2019年3月24日23:01:39
 * zhiliang.lan
 */

public class VillageVO {

    private String ID;

    private String CODE;//村落编码

    private String NAME;//名称

    private String COMMENTS;//备注

    private String CREATE_ID;//创建人id

    private Timestamp CREATE_TIME;//创建时间

    private Timestamp LAST_MODIFY_TIME;//最新更新时间

    private String IS_DELETE;//删除标志

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
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

    public VillageVO(String ID, String CODE, String NAME, String COMMENTS, String CREATE_ID, Timestamp CREATE_TIME, Timestamp LAST_MODIFY_TIME, String IS_DELETE) {
        this.ID = ID;
        this.CODE = CODE;
        this.NAME = NAME;
        this.COMMENTS = COMMENTS;
        this.CREATE_ID = CREATE_ID;
        this.CREATE_TIME = CREATE_TIME;
        this.LAST_MODIFY_TIME = LAST_MODIFY_TIME;
        this.IS_DELETE = IS_DELETE;
    }
}
