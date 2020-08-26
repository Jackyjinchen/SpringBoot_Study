package com.jacky.springbootmybatis.Service.Impl;

import com.jacky.springbootmybatis.Dao.StudentMapper;
import com.jacky.springbootmybatis.Entity.Student;
import com.jacky.springbootmybatis.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {

        return studentMapper.selectAllStudent();
    }
}
