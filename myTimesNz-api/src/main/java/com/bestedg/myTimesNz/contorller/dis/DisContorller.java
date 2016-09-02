package com.bestedg.myTimesNz.contorller.dis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestedg.myTimesNz.common.response.SimpleResponse;
import com.bestedg.myTimesNz.db.entity.DistrictDictionary;
import com.bestedg.myTimesNz.service.DisService;

@RestController
@RequestMapping(value="dis")
public class DisContorller {

	@Autowired
	DisService service;
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public SimpleResponse<List<DistrictDictionary>> getAll() {
		SimpleResponse<List<DistrictDictionary>> simpleResponse = new SimpleResponse<List<DistrictDictionary>>();
		List<DistrictDictionary> allDis = service.getAll();
		simpleResponse.setData(allDis);
		return simpleResponse;
	}
}
