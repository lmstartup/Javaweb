package com.aaa.dao;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lmstart
 * @date 2021/9/21 - 13:11
 */
@Mapper //用来创建Dao对象
public interface UserDao {
    void save(User user);
    User findByUserName(String username);
}
