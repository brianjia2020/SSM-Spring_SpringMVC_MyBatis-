package demo3.Test;

import demo3.Service.UserService;
import demo3.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void testService1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo3/xml_config/bean1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
