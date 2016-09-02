package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TGuideOrderProcess;
import com.bestedg.myTimesNz.db.tdb.entity.TGuideOrderProcessExample;
import java.util.List;

public interface TGuideOrderProcessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGuideOrderProcess record);

    int insertSelective(TGuideOrderProcess record);

    List<TGuideOrderProcess> selectByExample(TGuideOrderProcessExample example);

    TGuideOrderProcess selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGuideOrderProcess record);

    int updateByPrimaryKey(TGuideOrderProcess record);
}