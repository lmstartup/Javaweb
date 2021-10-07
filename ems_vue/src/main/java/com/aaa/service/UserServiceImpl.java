package com.aaa.service;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Date;

/**
 * @author lmstart
 * @date 2021/9/21 - 13:36
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void register(User user) {
    //根据用户输入姓名判断用户是否存在
        User UserDB = userDao.findByUserName(user.getUsername());
        if(UserDB==null){
            user.setStatus("已激活");
            user.setRegisterTime(new Date());
            //调用我们的Dao
            userDao.save(user);
        }else {
            throw new RuntimeException("用户名已经存在！");
        }

    }

    @Override
    public User login(User user) {
        //1.根据用户输入的用户名进行查询
        User userDB = userDao.findByUserName(user.getUsername());
        if(!ObjectUtils.isEmpty(userDB)){
                if(userDB.getPassword().equals(user.getPassword())){
                    return userDB;
                }else {
                    throw new RuntimeException("密码输入错误！");
                }
        }else {
            throw new RuntimeException("用户名输入错误！");
        }
    }
}
