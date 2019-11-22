package com.xue.apps.cms.service;

import java.util.List;

import com.xue.apps.cms.bean.Category;
import com.xue.apps.cms.utils.CustomerException;

public interface ICategoryService {
	
	List<Category> findAll();
	void saveOrUpdate(Category category) throws CustomerException;
	void deleteById(long id) throws CustomerException;
	void batchDelete(long[] ids) throws CustomerException;
}
