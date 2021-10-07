package com.aaa.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmstart
 * @date 2021/9/4 - 11:06
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/test_view")
    public String test_view(){
        return "test_view";
    }
}
