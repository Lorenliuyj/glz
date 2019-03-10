package com.newtouch.glzdept.entity.VO;

import java.sql.Date;
import java.sql.Timestamp;

public class PovertyVisitVO {

    private Integer id;
    /*慰问对象id*/
    private Integer povertyPeopleId;
    /*慰问对象姓名*/
    private String povertyPeopleName;
    /*出生日期*/
    private Date birthday;
    /*所属村居*/
    private String village;
    /*慰问日期*/
    private Date condolenceDate;
    /*家庭情况*/
    private String familyDetail;
    /*走访人id*/
    private Integer visitorId;
    /*走访人名称*/
    private String visitorName;
    /*慰问品*/
    private String condolenceProduct;
    /*群众诉求*/
    private String massAppeal;
    /*慰问情况*/
    private String condolenceDetail;
    /*图片1*/
    private String image1;
    /*图片2*/
    private String image2;
    /*图片3*/
    private String image3;

    /*备注*/
    private String comments;
    /*创建人id*/
    private Integer createId;

    private Timestamp createTime;

    private String isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public Integer getPovertyPeopleId() {
        return povertyPeopleId;
    }

    public void setPovertyPeopleId(Integer povertyPeopleId) {
        this.povertyPeopleId = povertyPeopleId;
    }

    public String getPovertyPeopleName() {
        return povertyPeopleName;
    }

    public void setPovertyPeopleName(String povertyPeopleName) {
        this.povertyPeopleName = povertyPeopleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCondolenceDate() {
        return condolenceDate;
    }

    public void setCondolenceDate(Date condolenceDate) {
        this.condolenceDate = condolenceDate;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getFamilyDetail() {
        return familyDetail;
    }

    public void setFamilyDetail(String familyDetail) {
        this.familyDetail = familyDetail;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getCondolenceProduct() {
        return condolenceProduct;
    }

    public void setCondolenceProduct(String condolenceProduct) {
        this.condolenceProduct = condolenceProduct;
    }

    public String getMassAppeal() {
        return massAppeal;
    }

    public void setMassAppeal(String massAppeal) {
        this.massAppeal = massAppeal;
    }

    public String getCondolenceDetail() {
        return condolenceDetail;
    }

    public void setCondolenceDetail(String condolenceDetail) {
        this.condolenceDetail = condolenceDetail;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }
}
