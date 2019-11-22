package com.xue.apps.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xue.apps.cms.bean.Test;
import com.xue.apps.cms.bean.TestExample;
import com.xue.apps.cms.dao.TestMapper;
import com.xue.apps.cms.service.ITestService;


@Service
public class TestService implements ITestService{

	@Resource
	private TestMapper testMapper;

	@Override
	public void saveOrUpdate(Test test) {
		// TODO Auto-generated method stub
		if(test.getId()!=null) {
			testMapper.updateByPrimaryKey(test);
		}else {
			testMapper.insert(test);
		}
	}

	@Override
	public List<Test> findAll() {
		// TODO Auto-generated method stub
		TestExample example = new TestExample();
		
		return testMapper.selectByExample(example);
	}


	

	
	
}
