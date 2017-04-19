package com.demo.dao.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by liujie on 2017/4/19.
 */
public abstract class BaseMybatisDAO {

    protected static SqlSessionFactory sqlSessionFactory;

    static {
        System.out.println("init begin");
        try {
            Reader reader = Resources.getResourceAsReader("configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println("init success");
        } catch (Exception e) {
            System.out.println("init failed");
            e.printStackTrace();
        }

    }
}
