package com.jacky.springbootmybatis.Service.Impl;

import com.jacky.springbootmybatis.Dao.StudentMapper;
import com.jacky.springbootmybatis.Entity.Student;
import com.jacky.springbootmybatis.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //注入redistemplate Springboot自动配置好
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

//    @Override
//    public List<Student> getAllStudents() {
//        List<Student> studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
//        if(null==studentList){
//            studentList=studentMapper.selectAllStudent();
//            redisTemplate.opsForValue().set("allStudents",studentList);
//        }
//        return studentList;
//    }

//    @Override
//    public List<Student> getAllStudents() {
//        RedisSerializer redisSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(redisSerializer);
//
//        List<Student> studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
//        //双端检验
//        if(null == studentList){
//            synchronized (this){
//                studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
//                if(null == studentList){
//                    System.out.println("读取数据库");
//                    studentList = studentMapper.selectAllStudent();
//                    redisTemplate.opsForValue().set("allStudents",studentList);
//                } else {
//                    System.out.println("读取缓存");
//                }
//            }
//        } else {
//            System.out.println("读取缓存");
//        }
//        return studentList;
//    }


    //没有锁机制
    @Override
    public List<Student> getAllStudents() {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);

        List<Student> studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
        //双端检验
        if(null == studentList){
            System.out.println("读取数据库");
            studentList = studentMapper.selectAllStudent();
            redisTemplate.opsForValue().set("allStudents",studentList);
        } else {
            System.out.println("读取缓存");
        }
        return studentList;
    }
}
