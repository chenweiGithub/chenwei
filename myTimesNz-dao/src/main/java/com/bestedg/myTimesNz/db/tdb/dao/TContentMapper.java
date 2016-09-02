package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TContent;
import com.bestedg.myTimesNz.db.tdb.entity.TContentExample;
import java.util.List;

public interface TContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TContent record);

    int insertSelective(TContent record);

    List<TContent> selectByExampleWithBLOBs(TContentExample example);

    List<TContent> selectByExample(TContentExample example);

    TContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TContent record);

    int updateByPrimaryKeyWithBLOBs(TContent record);

    int updateByPrimaryKey(TContent record);
}