package com.aaa.dao;

import com.aaa.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lmstart
 * @date 2021/9/21 - 20:44
 */
@Mapper
public interface EmpDao {
    List<Emp> findAll();
}
