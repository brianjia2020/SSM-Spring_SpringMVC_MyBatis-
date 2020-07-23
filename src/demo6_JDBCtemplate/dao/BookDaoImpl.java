package demo6_JDBCtemplate.dao;

import demo6_JDBCtemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {

        String sql = "insert into SSM.t_book(bookId, bookname,bstatus) values(?,?,?)";
        System.out.println(book);
        int update = jdbcTemplate.update(sql,book.getBookId(),book.getBookname(),book.getBstatus());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update SSM.t_book set bookname = ?, bstatus = ? where bookId= ?";
        int update = jdbcTemplate.update(sql,book.getBookname(),book.getBstatus(),book.getBookId());
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from SSM.t_book where bookId = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int queryCount() {
        String sql = "select count(*) from SSM.t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book queryOne(String id) {
        String sql = "select * from SSM.t_book where bookId = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select * from SSM.t_book";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
    }


}
