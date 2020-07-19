package demo5_AOP_annotation.test;

import demo5_AOP_annotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo5_AOP_annotation/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
