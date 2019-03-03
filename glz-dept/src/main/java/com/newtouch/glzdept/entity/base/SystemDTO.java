package com.newtouch.glzdept.entity.base;

import java.util.List;

/**
 * @author lgyu
 * @date 2019/2/21 16:54
 */
public class SystemDTO {

    /**系统ID**/
    private String systemId;
    /**系统名称**/
    private  String systemName;
    /**版本号ID**/
    private List<String> versionIds;
    /**版本号**/
    private String version;
    /**用户**/
    private String account;
    /**标识**/
    private Boolean unDeal;
    /**故事id**/
    private String storyId;
    /**状态 active 未解决*/
    private String status;
    /**类型 redev 为返工*/
    private String type;
    /**时间范围 最小时间*/
    private String minTime;
    /**时间范围 最大时间*/
    private String maxTime;
    public SystemDTO() {
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public List<String> getVersionIds() {
        return versionIds;
    }

    public void setVersionIds(List<String> versionIds) {
        this.versionIds = versionIds;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getUnDeal() {
        return unDeal;
    }

    public void setUnDeal(Boolean unDeal) {
        this.unDeal = unDeal;
    }

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }
}
