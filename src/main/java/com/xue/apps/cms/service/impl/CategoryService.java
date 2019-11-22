package com.xue.apps.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xue.apps.cms.bean.Category;
import com.xue.apps.cms.bean.CategoryExample;
import com.xue.apps.cms.dao.CategoryMapper;
import com.xue.apps.cms.service.ICategoryService;
import com.xue.apps.cms.utils.CustomerException;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryMapper.selectByExample(new CategoryExample());
	}

	@Override
	public void saveOrUpdate(Category category) throws CustomerException {
		// TODO Auto-generated method stub
		if(category.getId() != null) {
			categoryMapper.updateByPrimaryKey(category);
		}else {
			//判断是否重名
			CategoryExample example = new CategoryExample();
			example.createCriteria().andNameEqualTo(category.getName());
			List<Category> list = categoryMapper.selectByExample(example);
			if(list.size()>0) {
				throw new CustomerException("该栏目已经存在");
			}
			categoryMapper.insert(category);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		// TODO Auto-generated method stub
		Category category = categoryMapper.selectByPrimaryKey(id);
		if(category == null) {
			throw new CustomerException("要删除的栏目不存在");
		}
		categoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public void batchDelete(long[] ids) throws CustomerException {
		// TODO Auto-generated method stub
		for(long id : ids) {
			this.deleteById(id);
		}
	}

}
