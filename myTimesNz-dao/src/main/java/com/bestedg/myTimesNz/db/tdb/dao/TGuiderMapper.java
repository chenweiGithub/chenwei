package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TGuider;
import com.bestedg.myTimesNz.db.tdb.entity.TGuiderExample;
import java.util.List;

public interface TGuiderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGuider record);

    int insertSelective(TGuider record);

    List<TGuider> selectByExample(TGuiderExample example);

    TGuider selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGuider record);

    int updateByPrimaryKey(TGuider record);
}