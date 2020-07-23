package demo6_JDBCtemplate.test;

import demo6_JDBCtemplate.entity.Book;
import demo6_JDBCtemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testJdbctemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("2");
        book.setBookname("Spring");
        book.setBstatus("Done");
        bookService.addBook(book);
    }

    @Test
    public void testUpdateBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookname("Java Spring");
        book.setBstatus("Done");
        bookService.updateBook(book);
    }

    @Test
    public void testDeleteBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId("1");
        book.setBookname("Java Spring");
        book.setBstatus("Done");
        bookService.deleteBook("1");
    }

    @Test
    public void testQueryCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("There are "+bookService.queryCount()+" books");
    }

    @Test
    public void testQueryOne(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.queryOne("1"));
    }

    @Test
    public void testQueryBooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/demo6_JDBCtemplate/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.queryBooks().forEach(System.out::println);
    }

}
