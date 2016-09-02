package com.bestedg.myTimesNz.db.dao;

import java.util.List;

import com.bestedg.myTimesNz.db.entity.DistrictDictionary;
import com.bestedg.myTimesNz.db.tdb.dao.TDistrictDictionaryMapper;

public interface DistrictDictionaryMapper extends TDistrictDictionaryMapper{

	List<DistrictDictionary> getAll();
}