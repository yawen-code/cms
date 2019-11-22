package com.xue.apps.cms.service;

import java.util.List;

import com.xue.apps.cms.bean.Article;
import com.xue.apps.cms.bean.extend.ArticleExtend;
import com.xue.apps.cms.utils.CustomerException;

public interface IArticleService {
	List<Article> findAll();
	List<ArticleExtend> cascadeFindAll();
	ArticleExtend findById(long id);
	void saveOrUpdate(Article article) throws CustomerException;
	
	List<ArticleExtend> findByCategoryId();
	List<ArticleExtend> findByArticleId();
	
}
