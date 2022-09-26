package com.matpansoft.main.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.matpansoft.common.util.MatMap;
import com.matpansoft.main.mapper.TestMapper;
import com.matpansoft.main.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	@Resource(name = "testMapper")
	private TestMapper testMapper;
	
	@Override
	public ArrayList<MatMap> testMappertest(MatMap matMap) throws Exception {
		return testMapper.testMappertest(matMap);
	}
}