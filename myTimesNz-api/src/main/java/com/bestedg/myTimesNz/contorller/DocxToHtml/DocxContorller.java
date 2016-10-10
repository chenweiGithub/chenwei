package com.bestedg.myTimesNz.contorller.DocxToHtml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestedg.myTimesNz.common.response.SimpleResponse;
import com.bestedg.myTimesNz.db.entity.DistrictDictionary;
import com.bestedg.myTimesNz.service.DocxToHtmlService;

@RestController
@RequestMapping(value="docx")
public class DocxContorller {

	@Autowired
	DocxToHtmlService service;
	
//	@RequestMapping(value="list",method=RequestMethod.GET)
//	public SimpleResponse<List<DistrictDictionary>> getAll() {
//		SimpleResponse<List<DistrictDictionary>> simpleResponse = new SimpleResponse<List<DistrictDictionary>>();
//		List<DistrictDictionary> allDis = service.getAll();
//		simpleResponse.setData(allDis);
//		return simpleResponse;
//	}
	
	@RequestMapping(value="toHtml",method=RequestMethod.GET)
	public SimpleResponse<List<DistrictDictionary>> getAll() throws Exception {
		SimpleResponse<List<DistrictDictionary>> simpleResponse = new SimpleResponse<List<DistrictDictionary>>();
		 service.docxToHtml();
//		simpleResponse.setData(allDis);
		return simpleResponse;
	}
}
