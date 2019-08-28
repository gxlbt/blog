package com.lbt.blog.service;

import com.lbt.blog.po.User;
import org.springframework.stereotype.Service;
public interface UserService {
    User checkUser(String username, String password);
}
