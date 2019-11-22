package com.xue.apps.cms.service;

import java.util.List;

import com.xue.apps.cms.bean.Test;

public interface ITestService {

	void saveOrUpdate(Test test);
	List<Test> findAll();
	
}
