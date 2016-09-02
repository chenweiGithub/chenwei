package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TUserBasic;
import com.bestedg.myTimesNz.db.tdb.entity.TUserBasicExample;
import java.util.List;

public interface TUserBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserBasic record);

    int insertSelective(TUserBasic record);

    List<TUserBasic> selectByExample(TUserBasicExample example);

    TUserBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserBasic record);

    int updateByPrimaryKey(TUserBasic record);
}