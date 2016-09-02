package com.bestedg.myTimesNz.db.tdb.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TProduct {
    private Integer id;

    private Integer serviceItemsId;

    private Integer hoursId;

    private Byte level;

    private BigDecimal price;

    private Double intermediaryProportion;

    private Integer cityId;

    private Byte isDelete;

    private Date createTime;

    private Date updateTime;

    private Integer createManagerId;

    private Integer updateManagerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceItemsId() {
        return serviceItemsId;
    }

    public void setServiceItemsId(Integer serviceItemsId) {
        this.serviceItemsId = serviceItemsId;
    }

    public Integer getHoursId() {
        return hoursId;
    }

    public void setHoursId(Integer hoursId) {
        this.hoursId = hoursId;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getIntermediaryProportion() {
        return intermediaryProportion;
    }

    public void setIntermediaryProportion(Double intermediaryProportion) {
        this.intermediaryProportion = intermediaryProportion;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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

    public Integer getCreateManagerId() {
        return createManagerId;
    }

    public void setCreateManagerId(Integer createManagerId) {
        this.createManagerId = createManagerId;
    }

    public Integer getUpdateManagerId() {
        return updateManagerId;
    }

    public void setUpdateManagerId(Integer updateManagerId) {
        this.updateManagerId = updateManagerId;
    }
}