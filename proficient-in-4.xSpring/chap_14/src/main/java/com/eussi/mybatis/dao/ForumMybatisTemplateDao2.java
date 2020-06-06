package com.eussi.mybatis.dao;

import com.eussi.mybatis.domain.Forum;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ForumMybatisTemplateDao2 {

    @Autowired
    private ForumMybatisDao forumMybatisDao;


    public Forum getForum(int forumId) {
        return forumMybatisDao.getForum(1);
    }

}
