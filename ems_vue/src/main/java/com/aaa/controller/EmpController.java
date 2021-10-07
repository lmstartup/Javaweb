package com.aaa.controller;

import com.aaa.entity.Emp;
import com.aaa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lmstart
 * @date 2021/9/21 - 21:06
 */
@RequestMapping("emp")
@RestController
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService empService;
    //获取员工列表
    @GetMapping("findAll")
    public List<Emp> findAll(){
        return empService.findAll();
    }
}
