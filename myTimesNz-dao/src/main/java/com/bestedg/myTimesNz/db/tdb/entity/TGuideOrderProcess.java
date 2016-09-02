package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.Date;

public class TGuideOrderProcess {
    private Integer id;

    private String sn;

    private Integer guiderId;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte isDelete;

    private Integer createManagerId;

    private Integer updateMangerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getGuiderId() {
        return guiderId;
    }

    public void setGuiderId(Integer guiderId) {
        this.guiderId = guiderId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getCreateManagerId() {
        return createManagerId;
    }

    public void setCreateManagerId(Integer createManagerId) {
        this.createManagerId = createManagerId;
    }

    public Integer getUpdateMangerId() {
        return updateMangerId;
    }

    public void setUpdateMangerId(Integer updateMangerId) {
        this.updateMangerId = updateMangerId;
    }
}