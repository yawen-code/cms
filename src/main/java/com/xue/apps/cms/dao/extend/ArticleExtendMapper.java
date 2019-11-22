package com.xue.apps.cms.dao.extend;

import java.util.List;

import com.xue.apps.cms.bean.extend.ArticleExtend;

public interface ArticleExtendMapper {
	
	List<ArticleExtend> selectAll();
	ArticleExtend selectById(long id);
	
}
