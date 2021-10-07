package com.aaa.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lmstart
 * @date 2021/9/3 - 14:13
 */
@Controller
//@RequestMapping("/hellow")
public class RequestMappingController {
    @RequestMapping(value = {"/testRequestMapping" ,"/test"},method = {RequestMethod.GET,RequestMethod.POST})
    public String success(){
        return "success";
    }
    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id,@PathVariable("username") String username){
        System.out.println("id:"+id+"username:"+username);
        return "success";
    }
}
