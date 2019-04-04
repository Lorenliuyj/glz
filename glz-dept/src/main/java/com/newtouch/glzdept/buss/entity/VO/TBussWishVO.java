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
    private Date wishCreateDate;

    /**
     * 心愿完成时间
     */
    private Date wishFinishDate;

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

    public Date getWishCreateDate() {
        return wishCreateDate;
    }

    public void setWishCreateDate(Date wishCreateDate) {
        this.wishCreateDate = wishCreateDate;
    }

    public Date getWishFinishDate() {
        return wishFinishDate;
    }

    public void setWishFinishDate(Date wishFinishDate) {
        this.wishFinishDate = wishFinishDate;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TBussWishVO other = (TBussWishVO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPovertyPeopleId() == null ? other.getPovertyPeopleId() == null : this.getPovertyPeopleId().equals(other.getPovertyPeopleId()))
            && (this.getMakePovertyVisitId() == null ? other.getMakePovertyVisitId() == null : this.getMakePovertyVisitId().equals(other.getMakePovertyVisitId()))
            && (this.getFinishPovertyVisitId() == null ? other.getFinishPovertyVisitId() == null : this.getFinishPovertyVisitId().equals(other.getFinishPovertyVisitId()))
            && (this.getWishTitle() == null ? other.getWishTitle() == null : this.getWishTitle().equals(other.getWishTitle()))
            && (this.getWishContent() == null ? other.getWishContent() == null : this.getWishContent().equals(other.getWishContent()))
            && (this.getWishStatus() == null ? other.getWishStatus() == null : this.getWishStatus().equals(other.getWishStatus()))
            && (this.getWishCreateDate() == null ? other.getWishCreateDate() == null : this.getWishCreateDate().equals(other.getWishCreateDate()))
            && (this.getWishFinishDate() == null ? other.getWishFinishDate() == null : this.getWishFinishDate().equals(other.getWishFinishDate()))
            && (this.getRealizeIntro() == null ? other.getRealizeIntro() == null : this.getRealizeIntro().equals(other.getRealizeIntro()))
            && (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getRealizeName() == null ? other.getRealizeName() == null : this.getRealizeName().equals(other.getRealizeName()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastModifyTime() == null ? other.getLastModifyTime() == null : this.getLastModifyTime().equals(other.getLastModifyTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPovertyPeopleId() == null) ? 0 : getPovertyPeopleId().hashCode());
        result = prime * result + ((getMakePovertyVisitId() == null) ? 0 : getMakePovertyVisitId().hashCode());
        result = prime * result + ((getFinishPovertyVisitId() == null) ? 0 : getFinishPovertyVisitId().hashCode());
        result = prime * result + ((getWishTitle() == null) ? 0 : getWishTitle().hashCode());
        result = prime * result + ((getWishContent() == null) ? 0 : getWishContent().hashCode());
        result = prime * result + ((getWishStatus() == null) ? 0 : getWishStatus().hashCode());
        result = prime * result + ((getWishCreateDate() == null) ? 0 : getWishCreateDate().hashCode());
        result = prime * result + ((getWishFinishDate() == null) ? 0 : getWishFinishDate().hashCode());
        result = prime * result + ((getRealizeIntro() == null) ? 0 : getRealizeIntro().hashCode());
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getRealizeName() == null) ? 0 : getRealizeName().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastModifyTime() == null) ? 0 : getLastModifyTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", povertyPeopleId=").append(povertyPeopleId);
        sb.append(", makePovertyVisitId=").append(makePovertyVisitId);
        sb.append(", finishPovertyVisitId=").append(finishPovertyVisitId);
        sb.append(", wishTitle=").append(wishTitle);
        sb.append(", wishContent=").append(wishContent);
        sb.append(", wishStatus=").append(wishStatus);
        sb.append(", wishCreateDate=").append(wishCreateDate);
        sb.append(", wishFinishDate=").append(wishFinishDate);
        sb.append(", realizeIntro=").append(realizeIntro);
        sb.append(", recordId=").append(recordId);
        sb.append(", realizeName=").append(realizeName);
        sb.append(", createId=").append(createId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}