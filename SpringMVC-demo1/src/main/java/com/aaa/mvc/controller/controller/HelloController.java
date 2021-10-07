package com.aaa.mvc.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmstart
 * @date 2021/9/2 - 17:15
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public  String index(){
        //返回试图名称
        return  "index";
    }
    @RequestMapping("/target")
        public String traget(){
        return "traget";
        }

}
