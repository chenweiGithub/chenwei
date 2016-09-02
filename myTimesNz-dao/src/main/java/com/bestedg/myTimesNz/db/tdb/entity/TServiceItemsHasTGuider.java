package com.bestedg.myTimesNz.db.tdb.entity;

import java.util.Date;

public class TServiceItemsHasTGuider extends TServiceItemsHasTGuiderKey {
    private Date updateTiem;

    private Date creatTime;

    public Date getUpdateTiem() {
        return updateTiem;
    }

    public void setUpdateTiem(Date updateTiem) {
        this.updateTiem = updateTiem;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}