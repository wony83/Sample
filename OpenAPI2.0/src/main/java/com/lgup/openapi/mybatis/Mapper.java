package com.lgup.openapi.mybatis;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mybatis Mapper Marker Annotation
 * 
 * {@link org.mybatis.spring.mapper.MapperScannerConfigurer}에 의해서 Mapper Bean으로 등록되어야 하는 대상으로 사용
 * 
 * @author Wony
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mapper {
}
