package com.aaa.service;

import com.aaa.entity.User;

/**
 * @author lmstart
 * @date 2021/9/21 - 13:35
 */
public interface UserService {
    //用户注册
    void register(User user);
    //用户登录
    User login(User user);
}
