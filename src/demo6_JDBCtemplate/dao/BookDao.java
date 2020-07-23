package demo6_JDBCtemplate.dao;

import demo6_JDBCtemplate.entity.Book;

import java.util.List;

public interface BookDao {
    //add book
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int queryCount();

    Book queryOne(String id);

    List<Book> queryBooks();
}
