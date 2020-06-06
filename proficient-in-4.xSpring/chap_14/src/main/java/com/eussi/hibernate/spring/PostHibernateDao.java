package com.eussi.hibernate.spring;

import com.eussi.hibernate.domain.Post;
import org.springframework.stereotype.Repository;


@Repository
public class PostHibernateDao extends BaseDao {
	
	public void addPost(Post post) {
		getHibernateTemplate().save(post);	
	}

	public Post getPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

}
