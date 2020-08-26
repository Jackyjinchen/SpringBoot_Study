package com.jacky.springbootmybatis.Controller;

import com.jacky.springbootmybatis.Entity.Student;
import com.jacky.springbootmybatis.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/boot/students")
    public Object students(){
        List<Student> allStudents;
        //多线程测试缓存穿透
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        for(int i=0;i<10000;i++){
            executorService.submit(() -> {
                studentService.getAllStudents();
            });
        }
        return studentService.getAllStudents();
    }

}
