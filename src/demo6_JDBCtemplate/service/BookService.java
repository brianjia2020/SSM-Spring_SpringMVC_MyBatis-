package demo6_JDBCtemplate.service;

import demo6_JDBCtemplate.dao.BookDao;
import demo6_JDBCtemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //injection of dao
    @Autowired
    private BookDao bookDao;
    //add user
    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void deleteBook(String id){
        bookDao.delete(id);
    }

    public int queryCount(){
        return bookDao.queryCount();
    }

    public Book queryOne(String id){
        return bookDao.queryOne(id);
    }

    public List<Book> queryBooks(){
        return bookDao.queryBooks();
    }
}
