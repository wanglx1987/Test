package com.todo.model;

public class UserInfo {
    private String userId;

    private String name;

    private String password;

    private String wxOpenid;

    private String type;

    private String status;

    private String isFreeHotspot;

    private String createChannel;

    private Integer createDttm;

    private Integer lastLoginDttm;

    private String lastLoginIp;

    public UserInfo(String userId, String name, String password, String wxOpenid, String type, String status, String isFreeHotspot, String createChannel, Integer createDttm, Integer lastLoginDttm, String lastLoginIp) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.wxOpenid = wxOpenid;
        this.type = type;
        this.status = status;
        this.isFreeHotspot = isFreeHotspot;
        this.createChannel = createChannel;
        this.createDttm = createDttm;
        this.lastLoginDttm = lastLoginDttm;
        this.lastLoginIp = lastLoginIp;
    }

    public UserInfo() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsFreeHotspot() {
        return isFreeHotspot;
    }

    public void setIsFreeHotspot(String isFreeHotspot) {
        this.isFreeHotspot = isFreeHotspot;
    }

    public String getCreateChannel() {
        return createChannel;
    }

    public void setCreateChannel(String createChannel) {
        this.createChannel = createChannel;
    }

    public Integer getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Integer createDttm) {
        this.createDttm = createDttm;
    }

    public Integer getLastLoginDttm() {
        return lastLoginDttm;
    }

    public void setLastLoginDttm(Integer lastLoginDttm) {
        this.lastLoginDttm = lastLoginDttm;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
}