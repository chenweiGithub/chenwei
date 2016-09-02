package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.Date;

public class TRole {
    private Integer id;

    private String name;

    private Byte type;

    private String remarks;

    private Date createTime;

    private Date updateTime;

    private Integer creatManagerId;

    private String updateManagerId;

    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public Integer getCreatManagerId() {
        return creatManagerId;
    }

    public void setCreatManagerId(Integer creatManagerId) {
        this.creatManagerId = creatManagerId;
    }

    public String getUpdateManagerId() {
        return updateManagerId;
    }

    public void setUpdateManagerId(String updateManagerId) {
        this.updateManagerId = updateManagerId == null ? null : updateManagerId.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}