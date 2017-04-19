package com.demo;

import com.demo.dao.OrderDAO;
import com.demo.dao.impl.OrderDAOImpl;
import com.demo.domain.OrderDO;

import java.util.Date;

/**
 * Created by liujie on 2017/4/18.
 */
public class MybatisMain {

    private static OrderDAO orderDAO;

    public static void main(String[] arg) {
        System.out.println(">>> test begin");
        orderDAO = new OrderDAOImpl();
//        insert();
        System.out.println(orderDAO.selectByPrimaryKey(1L));
        System.out.println(">>> test end");
    }

    public static void insert() {
        OrderDO orderDO = new OrderDO();
        orderDO.setBuyer("liujie");
        orderDO.setDetail("一支pen1");
        orderDO.setCreatedTime(new Date());
        System.out.println(orderDAO.insert(orderDO) + ": " + orderDO);
    }

}
