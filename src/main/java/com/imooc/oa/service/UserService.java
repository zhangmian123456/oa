package com.imooc.oa.service;

import com.imooc.oa.dao.UserDao;
import com.imooc.oa.entity.User;
import com.imooc.oa.service.exception.BussinessException;

public class UserService {
    private UserDao userDao = new UserDao();
    public User checkLogin(String username, String password){
        User user = userDao.selectByUsername(username);
        if(user == null){
            //抛出用户不存在的异常
            throw new BussinessException("L001", "用户名不存在");
        }
        if(!password.equals(user.getPassword())){
            //抛出密码错误的异常
            throw new BussinessException("L002", "密码错误");
        }
        return user;
    }
}
