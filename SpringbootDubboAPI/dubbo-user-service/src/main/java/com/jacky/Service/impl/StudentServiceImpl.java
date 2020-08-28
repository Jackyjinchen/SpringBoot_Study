package com.jacky.Service.impl;

import com.jacky.Dao.StudentMapper;
import com.jacky.Entity.Student;
import com.jacky.Service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DubboService
//@org.apache.dubbo.config.annotation.Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
