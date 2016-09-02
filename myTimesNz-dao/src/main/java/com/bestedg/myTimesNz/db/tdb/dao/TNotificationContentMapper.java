package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TNotificationContent;
import com.bestedg.myTimesNz.db.tdb.entity.TNotificationContentExample;
import java.util.List;

public interface TNotificationContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TNotificationContent record);

    int insertSelective(TNotificationContent record);

    List<TNotificationContent> selectByExample(TNotificationContentExample example);

    TNotificationContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TNotificationContent record);

    int updateByPrimaryKey(TNotificationContent record);
}