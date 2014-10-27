package com.lgup.openapi.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lgup.openapi.sample.service.SampleService;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	private static Logger LOG = LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> getSample() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "wony");
		map.put("age", "32");
		
		LOG.debug("######################## debug");
		LOG.debug("######################## debug");
		LOG.debug("######################## debug");
		LOG.debug("######dddd");
		LOG.debug("######################## debug");
		LOG.debug("######################## debug");
		LOG.debug("######################## debug");
		LOG.debug("######################## debug");
		LOG.info("######################## info");
		LOG.info("######################## info");
		LOG.info("######################## info");
		LOG.info("######################## info");
		LOG.info("############iiii######## info");
		LOG.info("######################## info");
		LOG.info("######################## info");
		LOG.info("######################## info");
		LOG.info("######################## info");
		
		return map;
	}
	/*
	public List<Sample> getAllSample() {
		return sampleService.findById();
	}
	*/

}
