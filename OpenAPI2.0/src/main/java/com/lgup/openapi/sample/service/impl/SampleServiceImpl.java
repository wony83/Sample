package com.lgup.openapi.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgup.openapi.sample.model.Sample;
import com.lgup.openapi.sample.persistence.SampleMapper;
import com.lgup.openapi.sample.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	private SampleMapper sampleMapper;

	@Override
	public List<Sample> findById() {
		
		return sampleMapper.findById();
	}
	
	@Override
	public int insertSample(Sample sample) {
		int result = sampleMapper.insertSample(sample);
		
		return result;
	}

}
