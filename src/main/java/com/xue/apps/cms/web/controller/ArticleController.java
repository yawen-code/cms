package com.xue.apps.cms.web.controller;

import java.util.List;


import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xue.apps.cms.bean.Article;
import com.xue.apps.cms.bean.extend.ArticleExtend;
import com.xue.apps.cms.service.IArticleService;
import com.xue.apps.cms.utils.Message;
import com.xue.apps.cms.utils.MessageUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController//加这个注解，就会往前端返回json格式的数据
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private IArticleService articleService;
	
	@ApiOperation(value = "查询所有文章")
	@GetMapping("findAll")
	public Message findAll(){
		List<Article> list =  articleService.findAll();
		 return MessageUtil.success(list);
	}
	
	@ApiOperation(value = "级联查询文章",notes = "级联所属栏目，作者")
	@GetMapping("cascadeFindAll")
	public Message  cascadeFindAll(){
		List<ArticleExtend> list =  articleService.cascadeFindAll();
		return MessageUtil.success(list);
	}
	
	@ApiOperation(value = "通过ID查询")
	@ApiImplicitParams(
			@ApiImplicitParam(name = "id",value = "编号，主键",paramType = "query")//默认会把数据接受成json；但需要的是查询字符串格式
			)
	@GetMapping("findById")
	public Message findById(long id) {
		 ArticleExtend articleExtend = articleService.findById(id);
		return MessageUtil.success(articleExtend);
	}
	
	@ApiOperation(value="保存会更新文章信息",notes="如果id不为空，代表更新数据")
	@ApiImplicitParams(
			{@ApiImplicitParam(name = "id",value = "编号，主键",paramType = "form",required = false),//默认会把数据接受成json；但需要的是查询字符串格式
			@ApiImplicitParam(name = "title",value = "标题",paramType = "form",required = true),//默认会把数据接受成json；但需要的是查询字符串格式
			@ApiImplicitParam(name = "content",value = "正文",paramType = "form",required = true),//默认会把数据接受成json；但需要的是查询字符串格式
			@ApiImplicitParam(name = "source",value = "资源",paramType = "form",required = false),//默认会把数据接受成json；但需要的是查询字符串格式
			@ApiImplicitParam(name = "categoryId",value = "栏目编号",paramType = "form",required = true),//默认会把数据接受成json；但需要的是查询字符串格式
			@ApiImplicitParam(name = "authorId",value = "作者编号",paramType = "form",required = false)//默认会把数据接受成json；但需要的是查询字符串格式
			})
	@PostMapping("saveOrUpdate")
	public Message saveOrUpdate(
			Long id,
			@NotNull String title,
			@NotNull String content,
			String source,
			@NotNull Long categoryId,
			Long authorId) {
		Article article = new Article();
		article.setId(id);
		article.setTitle(title);
		article.setContent(content);
		article.setSource(source);
		article.setCategoryId(categoryId);
		article.setAuthorId(authorId);
		articleService.saveOrUpdate(article);
		return MessageUtil.success("更新成功");
	}
	
	
}
