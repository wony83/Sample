package com.lgup.openapi.sample.service;

import java.util.List;

import com.lgup.openapi.sample.model.Sample;

public interface SampleService {
	
	public List<Sample> findById();
	
	public int insertSample(Sample sample);

}
