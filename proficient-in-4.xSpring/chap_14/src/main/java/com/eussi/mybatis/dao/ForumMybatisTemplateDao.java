package com.eussi.mybatis.dao;

import com.eussi.mybatis.domain.Forum;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ForumMybatisTemplateDao {

//    private SqlSessionTemplate sessionTemplate;
//
//    @Autowired
//    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
//        this.sessionTemplate = sessionTemplate;
//    }
//
//    public Forum getForum(int forumId) {
//        return (Forum) sessionTemplate.selectOne(
//                "com.eussi.mybatis.dao.ForumMybatisDao.getForum",
//                forumId);
//    }
//
//    public Forum getForum2(int forumId) {
//        ForumMybatisDao forumMybatisDao =
//                sessionTemplate.getMapper(ForumMybatisDao.class);
//        return forumMybatisDao.getForum(forumId);
//    }
}
