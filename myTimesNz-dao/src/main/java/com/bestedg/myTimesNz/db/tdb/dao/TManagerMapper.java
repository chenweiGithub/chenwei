package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TManager;
import com.bestedg.myTimesNz.db.tdb.entity.TManagerExample;
import java.util.List;

public interface TManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TManager record);

    int insertSelective(TManager record);

    List<TManager> selectByExample(TManagerExample example);

    TManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TManager record);

    int updateByPrimaryKey(TManager record);
}