package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuider;
import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuiderExample;
import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsHasTGuiderKey;
import java.util.List;

public interface TServiceItemsHasTGuiderMapper {
    int deleteByPrimaryKey(TServiceItemsHasTGuiderKey key);

    int insert(TServiceItemsHasTGuider record);

    int insertSelective(TServiceItemsHasTGuider record);

    List<TServiceItemsHasTGuider> selectByExample(TServiceItemsHasTGuiderExample example);

    TServiceItemsHasTGuider selectByPrimaryKey(TServiceItemsHasTGuiderKey key);

    int updateByPrimaryKeySelective(TServiceItemsHasTGuider record);

    int updateByPrimaryKey(TServiceItemsHasTGuider record);
}