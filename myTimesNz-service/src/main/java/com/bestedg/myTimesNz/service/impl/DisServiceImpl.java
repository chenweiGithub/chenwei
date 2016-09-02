package com.bestedg.myTimesNz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestedg.myTimesNz.db.dao.DistrictDictionaryMapper;
import com.bestedg.myTimesNz.db.entity.DistrictDictionary;
import com.bestedg.myTimesNz.service.DisService;

@Service
public class DisServiceImpl implements DisService {

	@Autowired
	DistrictDictionaryMapper dao;
	
	@Override
	public List<DistrictDictionary> getAll() {
		return 	dao.getAll();
	}

}
