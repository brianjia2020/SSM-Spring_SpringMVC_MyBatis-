package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Bean.Employee;
import com.atguigu.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_config/bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testAdd2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring5/xml_config/bean4.xml");
        Employee userService = context.getBean("emp",Employee.class);
        System.out.println(userService);
    }
}
