package demo3_annotation.Dao;


import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl add....");
    }
}
