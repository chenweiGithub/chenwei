package com.bestedg.myTimesNz.db.tdb.dao;

import com.bestedg.myTimesNz.db.tdb.entity.TDistrictDictionary;
import com.bestedg.myTimesNz.db.tdb.entity.TDistrictDictionaryExample;
import java.util.List;

public interface TDistrictDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDistrictDictionary record);

    int insertSelective(TDistrictDictionary record);

    List<TDistrictDictionary> selectByExample(TDistrictDictionaryExample example);

    TDistrictDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDistrictDictionary record);

    int updateByPrimaryKey(TDistrictDictionary record);
}