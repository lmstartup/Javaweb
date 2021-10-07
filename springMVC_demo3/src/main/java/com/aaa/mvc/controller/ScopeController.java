package com.aaa.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lmstart
 * @date 2021/9/4 - 11:14
 */
@Controller
public class ScopeController {
    @RequestMapping("/testModelAndView")
    public ModelAndView ModAndView(){
        ModelAndView mav = new ModelAndView();
        //处理模型数据，即向我们的request共享数据
        mav.addObject("testRequestScope","hellow,ModelAndView");
       //设置视图名称
        mav.setViewName("success");
        return mav;
    }
}
