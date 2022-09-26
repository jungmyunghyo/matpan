package com.matpansoft.main.mapper;

import java.util.ArrayList;

import com.matpansoft.common.util.MatMap;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("testMapper")
public interface TestMapper {
	public ArrayList<MatMap> testMappertest(MatMap matMap) throws Exception;
}