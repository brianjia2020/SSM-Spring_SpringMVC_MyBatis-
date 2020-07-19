package demo2_IOC_xml_config.Test;


import demo2_IOC_xml_config.Bean.Orders;
import demo2_IOC_xml_config.autowire.Emp;
import demo2_IOC_xml_config.collectiontype.Book;
import demo2_IOC_xml_config.collectiontype.Course;
import demo2_IOC_xml_config.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {
    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo2_IOC_xml_config/xml_config/bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo2_IOC_xml_config/xml_config/bean2.xml");
        Book book = context.getBean("book",Book.class);
        book.test();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo2_IOC_xml_config/xml_config/bean3.xml");
        Course myBean = context.getBean("mybean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/demo2_IOC_xml_config/xml_config/bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("4. Bean instance has been created");
        System.out.println(orders);

        context.close();
    }

    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo2_IOC_xml_config/xml_config/bean5.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
}
