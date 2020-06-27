package com.imooc.oa.service;

import com.imooc.oa.dao.RbacDao;
import com.imooc.oa.dao.UserDao;
import com.imooc.oa.entity.Node;
import com.imooc.oa.entity.User;
import com.imooc.oa.service.exception.BussinessException;
import com.imooc.oa.utils.MD5Utils;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();
    private RbacDao rbacDao = new RbacDao();
    public User checkLogin(String username, String password){
        User user = userDao.selectByUsername(username);
        if(user == null){
            //抛出用户不存在的异常
            throw new BussinessException("L001", "用户名不存在");
        }
        String md5 = MD5Utils.md5Digest(password, user.getSalt());
        if(!md5.equals(user.getPassword())){
            //抛出密码错误的异常
            throw new BussinessException("L002", "密码错误");
        }
        return user;
    }

    public List<Node> selectNodeByUserId(Long userId){
        return rbacDao.selectNodeByUserId(userId);
    }
}
