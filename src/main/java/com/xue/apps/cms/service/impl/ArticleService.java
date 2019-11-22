package com.xue.apps.cms.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xue.apps.cms.bean.Article;
import com.xue.apps.cms.bean.ArticleExample;
import com.xue.apps.cms.bean.extend.ArticleExtend;
import com.xue.apps.cms.dao.ArticleMapper;
import com.xue.apps.cms.dao.extend.ArticleExtendMapper;
import com.xue.apps.cms.service.IArticleService;
import com.xue.apps.cms.utils.CustomerException;

@Service
public class ArticleService implements IArticleService{

	@Resource
	private ArticleMapper articleMapper;
	
	@Resource
	private ArticleExtendMapper articleExtendMapper;
	
	@Override
	public List<Article> findAll() {
//	ArticleExample example = new ArticleExample();
		
		return articleMapper.selectByExample(new ArticleExample());
	}

	@Override
	public List<ArticleExtend> cascadeFindAll() {
		// TODO Auto-generated method stub
		return articleExtendMapper.selectAll();
	}

	@Override
	public ArticleExtend findById(long id) {
		// TODO Auto-generated method stub
		return articleExtendMapper.selectById(id);
	}

	@Override
	public void saveOrUpdate(Article article) throws CustomerException{
		// TODO Auto-generated method stub
		if(article.getId()!=null) {
			articleMapper.updateByPrimaryKey(article);
		}else {
			ArticleExample example = new ArticleExample();
			example.createCriteria().andTitleEqualTo(article.getTitle());
			
			List<Article> articles = articleMapper.selectByExample(example);
			if(articles.size()>0) {
				throw new CustomerException("标题不能重复");
			}
			
			article.setPublishTime(new Date().getTime());
			article.setStatus(ArticleExtend.STATUS_UNCHECK);
			article.setThumbDown(0l);
			article.setThumbUp(0l);
			articleMapper.insert(article);
		}
	}

	@Override
	public List<ArticleExtend> findByCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleExtend> findByArticleId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
