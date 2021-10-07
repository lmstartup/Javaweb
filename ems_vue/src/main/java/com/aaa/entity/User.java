package com.aaa.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author lmstart
 * @date 2021/9/21 - 12:5
 */
@Data
@Accessors(chain=true)
public class User {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
    private String status;
    private Date registerTime;



}
