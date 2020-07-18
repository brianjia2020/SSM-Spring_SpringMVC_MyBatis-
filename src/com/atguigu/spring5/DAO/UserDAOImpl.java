package com.atguigu.spring5.DAO;

import com.atguigu.spring5.Service.UserService;
import com.atguigu.spring5.User;

public class UserDAOImpl implements UserDAO {

//    private UserService userService = new UserService();
    @Override
    public void update() {
        System.out.println("UserDAO update method been called up.");
    }
}
