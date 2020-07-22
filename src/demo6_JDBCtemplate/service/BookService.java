package demo6_JDBCtemplate.service;

import demo6_JDBCtemplate.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //injection of dao
    @Autowired
    private BookDao bookDao;
}
