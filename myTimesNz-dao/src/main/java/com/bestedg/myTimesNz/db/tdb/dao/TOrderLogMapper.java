package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TOrderLog;
import com.bestedg.myTimesNz.db.tdb.entity.TOrderLogExample;
import java.util.List;

public interface TOrderLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOrderLog record);

    int insertSelective(TOrderLog record);

    List<TOrderLog> selectByExample(TOrderLogExample example);

    TOrderLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrderLog record);

    int updateByPrimaryKey(TOrderLog record);
}