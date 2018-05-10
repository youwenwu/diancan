package com.demo.diancan.model;

public class Desk {
    private Integer id;

    private Integer deskNum;

    private String deskDesc;

    private Integer seatCount;

    private Integer storeId;

    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeskNum() {
        return deskNum;
    }

    public void setDeskNum(Integer deskNum) {
        this.deskNum = deskNum;
    }

    public String getDeskDesc() {
        return deskDesc;
    }

    public void setDeskDesc(String deskDesc) {
        this.deskDesc = deskDesc == null ? null : deskDesc.trim();
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}