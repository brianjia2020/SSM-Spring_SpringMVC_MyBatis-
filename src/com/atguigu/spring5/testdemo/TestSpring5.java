package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void addTest(){
        //1. load spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_config/bean1.xml");
        //2. get the instance of the objects from configuration file
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_config/bean1.xml");
        Book book = context.getBean("book",Book.class);
        book.testDemo();
    }

    @Test
    public void testOrder1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_config/bean1.xml");
        Order order = context.getBean("order",Order.class);
        order.orderTest();
    }
}
