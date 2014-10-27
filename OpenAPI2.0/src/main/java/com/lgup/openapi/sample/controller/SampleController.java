package com.lgup.openapi.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lgup.openapi.sample.model.Sample;
import com.lgup.openapi.sample.service.SampleService;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	private static Logger LOG = LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Sample> getAllSample() {
		return sampleService.findById();
	}
	
	@RequestMapping(method={RequestMethod.POST,RequestMethod.PUT}, value="/{name}/{age}")
	@ResponseBody
	public int insertSample(@PathVariable("name")String name,  @PathVariable("age")int age) {
		Sample sample = new Sample();
		sample.setName(name);
		sample.setAge(age);
		
		LOG.info("name : " + sample.getName());
		LOG.info("age : " + sample.getAge());
		
		return sampleService.insertSample(sample);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{name}/{age}")
	@ResponseBody
	public int test(@PathVariable("name")String name,  @PathVariable("age")int age) {
		
		LOG.info("name : " + name);
		LOG.info("age : " + age);
		
		return 0;
	}
	
	
	
	
	/*
	public Map<String, String> getSample() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "wony");
		map.put("age", "32");
		
		LOG.debug("######################## debug");
		LOG.debug("######dddd");
		LOG.info("######################## info");
		LOG.info("############iiii######## info");
		
		return map;
	}
	*/

}
