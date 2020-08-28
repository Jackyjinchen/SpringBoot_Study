package com.jacky.Controller;

import com.jacky.Entity.Student;
import com.jacky.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/{id}")
    public Student selectById(@PathVariable("id") Integer id){

        return studentService.selectByPrimaryKey(id);
    }
}
