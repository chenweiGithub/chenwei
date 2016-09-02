package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.Date;

public class TGuider extends TServer {
    private Integer id;

    private Byte languageLevel;

    private Date auditTime;

    private Integer auditManagerId;

    private Byte auditStatus;

    private Byte isDelete;

    private Date updateTime;

    private Date createTime;

    private Integer updateManagerId;

    private Integer createMangerId;

    private Integer serverId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(Byte languageLevel) {
        this.languageLevel = languageLevel;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getAuditManagerId() {
        return auditManagerId;
    }

    public void setAuditManagerId(Integer auditManagerId) {
        this.auditManagerId = auditManagerId;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateManagerId() {
        return updateManagerId;
    }

    public void setUpdateManagerId(Integer updateManagerId) {
        this.updateManagerId = updateManagerId;
    }

    public Integer getCreateMangerId() {
        return createMangerId;
    }

    public void setCreateMangerId(Integer createMangerId) {
        this.createMangerId = createMangerId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }
}