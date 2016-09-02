package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.THours;
import com.bestedg.myTimesNz.db.tdb.entity.THoursExample;
import java.util.List;

public interface THoursMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THours record);

    int insertSelective(THours record);

    List<THours> selectByExample(THoursExample example);

    THours selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(THours record);

    int updateByPrimaryKey(THours record);
}