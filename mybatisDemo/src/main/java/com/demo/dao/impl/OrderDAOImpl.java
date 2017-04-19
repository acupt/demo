package com.demo.dao.impl;

import com.demo.dao.OrderDAO;
import com.demo.domain.OrderDO;
import org.apache.ibatis.session.SqlSession;

public class OrderDAOImpl extends BaseMybatisDAO implements OrderDAO {

    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(OrderDO record) {
        SqlSession session = null;
        int res = 0;
        try {
            session = sqlSessionFactory.openSession();
            OrderDAO dao = session.getMapper(OrderDAO.class);
            res = dao.insert(record);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return res;
    }

    public int insertSelective(OrderDO record) {
        return 0;
    }

    public OrderDO selectByPrimaryKey(Long id) {
        SqlSession session = null;
        OrderDO orderDO = null;
        try {
            session = sqlSessionFactory.openSession();
            OrderDAO dao = session.getMapper(OrderDAO.class);
            orderDO = dao.selectByPrimaryKey(id);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return orderDO;
    }

    public int updateByPrimaryKeySelective(OrderDO record) {
        return 0;
    }

    public int updateByPrimaryKey(OrderDO record) {
        return 0;
    }
}