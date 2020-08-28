package com.jacky.Service.impl;

import com.jacky.Dao.MeetingpubMapper;
import com.jacky.Entity.Meetingpub;
import com.jacky.Entity.Student;
import com.jacky.Service.MeetingpubService;
import com.jacky.Service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingpubServiceImpl implements MeetingpubService {

    //消费方通过Reference引用服务
    @DubboReference
    private StudentService studentService;

    @Autowired
    MeetingpubMapper meetingpubMapper;

    @Override
    public Meetingpub selectMeetingId(Integer id) {

        Meetingpub meetingpub=meetingpubMapper.selectByPrimaryKey(id);

        Student student=studentService.selectByPrimaryKey(meetingpub.getUid());

        meetingpub.setStudent(student);

        System.out.println("调用了服务！");
        System.out.println(meetingpub);
        return meetingpub;
    }
}
