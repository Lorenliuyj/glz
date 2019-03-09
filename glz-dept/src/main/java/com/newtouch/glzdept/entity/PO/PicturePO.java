package com.newtouch.glzdept.entity.PO;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午3:53
 * project:glz-dept
 */
public class PicturePO {

    private String id;

    private String tid;

    private String type;

    private String picture;

    private String isdelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "PictureVO{" +
                "id='" + id + '\'' +
                ", tid='" + tid + '\'' +
                ", type='" + type + '\'' +
                ", picture='" + picture + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }
}
