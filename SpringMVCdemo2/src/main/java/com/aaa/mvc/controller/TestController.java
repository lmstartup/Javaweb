package com.aaa.mvc.controller;

import com.aaa.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * @author lmstart
 * @date 2021/9/3 - 13:43
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/param")
    public String param(@RequestParam("user_name") String username,String password,String[] hobby){


        System.out.println("username:"+username+",password:"+password+",hobby:"+ Arrays.toString(hobby));
        return "param";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
