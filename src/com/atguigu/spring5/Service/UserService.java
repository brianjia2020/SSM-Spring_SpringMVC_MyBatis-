package com.atguigu.spring5.Service;

import com.atguigu.spring5.DAO.UserDAO;
import com.atguigu.spring5.DAO.UserDAOImpl;

public class UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(){
        System.out.println("Service add been called up.");
        userDAO.update();
        //normal way to call yo update method
//        UserDAO userDAO = new UserDAOImpl();
//        userDAO.update();
    }
}
