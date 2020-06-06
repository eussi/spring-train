package com.eussi.hibernate.raw;

import com.eussi.hibernate.domain.Forum;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author wangxueming
 * @create 2020-06-06 22:58
 * @description
 */
public class HibernateRawTest {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Transaction tx = session.beginTransaction();
        System.out.println(session.load(Forum.class,
                1));
        tx.commit();
    }
}
