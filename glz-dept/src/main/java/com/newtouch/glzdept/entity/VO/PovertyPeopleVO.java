package com.newtouch.glzdept.entity.VO;

import java.util.List;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午3:42
 * project:glz-dept
 */
public class PovertyPeopleVO {

    private String id;

    private String povertyName;

    private String sex;

    private String idcardNo;

    private String birthday;

    private String village;

    private String provertyType;

    private String address;

    private String phone;

    private String familyDetail;

    private String trouble;

    private String income;

    private String comments;

    private List<PictureVO> pictures;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPovertyName() {
        return povertyName;
    }

    public void setPovertyName(String povertyName) {
        this.povertyName = povertyName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getProvertyType() {
        return provertyType;
    }

    public void setProvertyType(String provertyType) {
        this.provertyType = provertyType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFamilyDetail() {
        return familyDetail;
    }

    public void setFamilyDetail(String familyDetail) {
        this.familyDetail = familyDetail;
    }

    public String getTrouble() {
        return trouble;
    }

    public void setTrouble(String trouble) {
        this.trouble = trouble;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<PictureVO> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureVO> pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "PovertyPeopleVO{" +
                "id='" + id + '\'' +
                ", povertyName='" + povertyName + '\'' +
                ", sex='" + sex + '\'' +
                ", idcardNo='" + idcardNo + '\'' +
                ", birthday='" + birthday + '\'' +
                ", village='" + village + '\'' +
                ", provertyType='" + provertyType + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", familyDetail='" + familyDetail + '\'' +
                ", trouble='" + trouble + '\'' +
                ", income='" + income + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}

