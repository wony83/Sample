package com.lgup.openapi.sample.persistence;

import java.util.List;

import com.lgup.openapi.mybatis.Mapper;
import com.lgup.openapi.sample.model.Sample;

/**
 * {@link Sample} 모델의 Data Access를 담당하는 마이바티스 매퍼 interface
 *
 * mybatis mapper XML[src/main/resources/mybatis/mappers/SampleMapper.xml]과 연결된다.
 *
 * @author wony
 */
@Mapper
public interface SampleMapper {
	List<Sample> findById();
}
