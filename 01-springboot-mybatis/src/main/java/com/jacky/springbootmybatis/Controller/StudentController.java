package com.jacky.springbootmybatis.Controller;

import com.jacky.springbootmybatis.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/boot/students")
    public Object students(){
        return studentService.getAllStudents();
    }

}
