package com.aaa.service;

import com.aaa.dao.EmpDao;
import com.aaa.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lmstart
 * @date 2021/9/21 - 21:02
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> findAll() {

        return empDao.findAll();
    }
}
