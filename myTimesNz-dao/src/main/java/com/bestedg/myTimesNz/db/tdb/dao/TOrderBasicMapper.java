package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TOrderBasic;
import com.bestedg.myTimesNz.db.tdb.entity.TOrderBasicExample;
import java.util.List;

public interface TOrderBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOrderBasic record);

    int insertSelective(TOrderBasic record);

    List<TOrderBasic> selectByExample(TOrderBasicExample example);

    TOrderBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrderBasic record);

    int updateByPrimaryKey(TOrderBasic record);
}