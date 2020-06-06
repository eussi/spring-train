package com.eussi.mybatis.dao;


import com.eussi.mybatis.domain.Post;

public interface PostMybatisDao{
	void addPost(Post post);
	Post getPost(int postId);
}
