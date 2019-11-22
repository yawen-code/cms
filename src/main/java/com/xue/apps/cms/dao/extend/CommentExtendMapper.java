package com.xue.apps.cms.dao.extend;

import java.util.List;

import com.xue.apps.cms.bean.Comment;

public interface CommentExtendMapper {
	
	List<Comment> selectByArticleId(long article_id);
	
}
