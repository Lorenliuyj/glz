package com.newtouch.glzdept.buss.entity.VO;

import java.sql.Timestamp;
import java.util.List;

public class PovertyVisitVO {

    private Integer id;
    /*慰问对象id*/
    private Integer povertyPeopleId;
    /*慰问对象姓名*/
    private String povertyPeopleName;
    /*出生日期*/
    private String birthday;
    /*所属村居*/
    private String villageId;
    /*慰问日期*/
    private String visitDate;
    /*家庭情况*/
    private String familyDetail;
    /*走访人id*/
    private Integer visitorId;
    /*走访人名称*/
    private String visitorName;
    /*慰问品*/
    private String visitGoods;
    /*群众诉求*/
    private String massAppeal;
    /*慰问情况*/
    private String visitDetail;
    /*图片1*/
    private String image1;
    /*图片2*/
    private String image2;
    /*图片3*/
    private String image3;
    /*缩略图*/
    private String imageMin;

    /*备注*/
    private String comments;
    /*创建人id*/
    private Integer createId;

    private Timestamp createTime;

    private String isdelete;

    private List<String> villages;

    private String villageName;

    //装在心愿实体
    private TBussWishVO tBussWishVO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getMassAppeal() {
        return massAppeal;
    }

    public void setMassAppeal(String massAppeal) {
        this.massAppeal = massAppeal;
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

    public String getImageMin() {
        return imageMin;
    }

    public void setImageMin(String imageMin) {
        this.imageMin = imageMin;
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

    public List<String> getVillages() {
        return villages;
    }

    public void setVillages(List<String> villages) {
        this.villages = villages;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getVisitGoods() {
        return visitGoods;
    }

    public void setVisitGoods(String visitGoods) {
        this.visitGoods = visitGoods;
    }

    public String getVisitDetail() {
        return visitDetail;
    }

    public void setVisitDetail(String visitDetail) {
        this.visitDetail = visitDetail;
    }

    public TBussWishVO gettBussWishVO() {
        return tBussWishVO;
    }

    public void settBussWishVO(TBussWishVO tBussWishVO) {
        this.tBussWishVO = tBussWishVO;
    }
}
