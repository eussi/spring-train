package com.eussi.mybatis;

import com.eussi.mybatis.dao.ForumMybatisTemplateDao;
import com.eussi.mybatis.dao.ForumMybatisTemplateDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * @author wangxueming
 * @create 2020-06-06 16:19
 * @description
 */

@ContextConfiguration("classpath:applicationContext-mybatis.xml")
public class MybatisTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private ForumMybatisTemplateDao2 forumMybatisTemplateDao2;




    @Test
    public void getForumDao() {
//        System.out.println(forumMybatisTemplateDao.getForum(1));

//        System.out.println(forumMybatisTemplateDao.getForum2(2));

        System.out.println(forumMybatisTemplateDao2.getForum(1));
    }

    @Test
    public void getForumDao2() {
//        System.out.println(forumMybatisTemplateDao.getForum(1));

//        System.out.println(forumMybatisTemplateDao.getForum2(2));
    }
}
