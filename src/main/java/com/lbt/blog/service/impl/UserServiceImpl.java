package com.lbt.blog.service.impl;

import com.lbt.blog.dao.UserRepository;
import com.lbt.blog.po.User;
import com.lbt.blog.service.UserService;
import com.lbt.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userDao;
    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
