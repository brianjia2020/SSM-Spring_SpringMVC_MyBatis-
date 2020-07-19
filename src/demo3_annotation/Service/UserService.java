package demo3_annotation.Service;

import demo3_annotation.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


/*
 * default is to UserService to userService
 * @Component(value=userService)
 */
@Repository
public class UserService {

//    @Autowired //field injection based on the type
//    @Qualifier(value = "userDaoImpl")
//    private UserDao userDao;

    @Autowired
    private UserDao userDao;

    @Value(value = "abc")
    private String username;

    public void add(){
        System.out.println("Service add");
        userDao.add();
    }
}
