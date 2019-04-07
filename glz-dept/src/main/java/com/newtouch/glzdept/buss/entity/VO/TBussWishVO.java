package com.newtouch.glzdept.buss.entity.VO;

import java.io.Serializable;
import java.util.Date;

/**
 * t_buss_wish
 * @author 
 */
public class TBussWishVO implements Serializable {
    private Long id;

    /**
     * 贫困户ID
     */
    private Long povertyPeopleId;

    /**
     * 许下心愿贫困户走访记录ID
     */
    private Long makePovertyVisitId;

    /**
     * 完成心愿贫困户走访记录ID
     */
    private Long finishPovertyVisitId;

    /**
     * 心愿主题
     */
    private String wishTitle;

    /**
     * 心愿内容
     */
    private String wishContent;

    /**
     * 心愿状态
     */
    private String wishStatus;

    /**
     * 心愿创建时间
     */
    private String wishCreateDate;

    /**
     * 心愿完成时间
     */
    private String wishFinishDate;

    /**
     * 实现心愿详情
     */
    private String realizeIntro;

    /**
     * 完成心愿时记录人ID
     */
    private Long recordId;

    /**
     * 实现心愿人姓名
     */
    private String realizeName;

    private Long createId;

    private Date createTime;

    private Date lastModifyTime;

    private String isDelete;

    private static final long serialVersionUID = 1L;

    //新增字段
    //困难id
    private String troubleId;

    //困难数目
    private String tSum;

    //贫困户姓名
    private String povertyName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPovertyPeopleId() {
        return povertyPeopleId;
    }

    public void setPovertyPeopleId(Long povertyPeopleId) {
        this.povertyPeopleId = povertyPeopleId;
    }

    public Long getMakePovertyVisitId() {
        return makePovertyVisitId;
    }

    public void setMakePovertyVisitId(Long makePovertyVisitId) {
        this.makePovertyVisitId = makePovertyVisitId;
    }

    public Long getFinishPovertyVisitId() {
        return finishPovertyVisitId;
    }

    public void setFinishPovertyVisitId(Long finishPovertyVisitId) {
        this.finishPovertyVisitId = finishPovertyVisitId;
    }

    public String getWishTitle() {
        return wishTitle;
    }

    public void setWishTitle(String wishTitle) {
        this.wishTitle = wishTitle;
    }

    public String getWishContent() {
        return wishContent;
    }

    public void setWishContent(String wishContent) {
        this.wishContent = wishContent;
    }

    public String getWishStatus() {
        return wishStatus;
    }

    public void setWishStatus(String wishStatus) {
        this.wishStatus = wishStatus;
    }

    public String getRealizeIntro() {
        return realizeIntro;
    }

    public void setRealizeIntro(String realizeIntro) {
        this.realizeIntro = realizeIntro;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getRealizeName() {
        return realizeName;
    }

    public void setRealizeName(String realizeName) {
        this.realizeName = realizeName;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getTroubleId() {
        return troubleId;
    }

    public void setTroubleId(String troubleId) {
        this.troubleId = troubleId;
    }

    public String gettSum() {
        return tSum;
    }

    public void settSum(String tSum) {
        this.tSum = tSum;
    }

    public String getPovertyName() {
        return povertyName;
    }

    public void setPovertyName(String povertyName) {
        this.povertyName = povertyName;
    }

    public String getWishCreateDate() {
        return wishCreateDate;
    }

    public void setWishCreateDate(String wishCreateDate) {
        this.wishCreateDate = wishCreateDate;
    }

    public String getWishFinishDate() {
        return wishFinishDate;
    }

    public void setWishFinishDate(String wishFinishDate) {
        this.wishFinishDate = wishFinishDate;
    }
}