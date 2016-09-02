package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TServer;
import com.bestedg.myTimesNz.db.tdb.entity.TServerExample;
import java.util.List;

public interface TServerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TServer record);

    int insertSelective(TServer record);

    List<TServer> selectByExample(TServerExample example);

    TServer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TServer record);

    int updateByPrimaryKey(TServer record);
}