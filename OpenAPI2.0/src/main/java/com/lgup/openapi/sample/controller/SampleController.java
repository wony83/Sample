package com.lgup.openapi.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

}
