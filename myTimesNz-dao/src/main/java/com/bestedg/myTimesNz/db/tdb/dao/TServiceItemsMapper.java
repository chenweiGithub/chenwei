package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TServiceItems;
import com.bestedg.myTimesNz.db.tdb.entity.TServiceItemsExample;
import java.util.List;

public interface TServiceItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TServiceItems record);

    int insertSelective(TServiceItems record);

    List<TServiceItems> selectByExample(TServiceItemsExample example);

    TServiceItems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TServiceItems record);

    int updateByPrimaryKey(TServiceItems record);
}