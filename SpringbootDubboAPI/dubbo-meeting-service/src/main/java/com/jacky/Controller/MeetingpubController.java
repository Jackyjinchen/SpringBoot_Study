package com.jacky.Controller;

import com.jacky.Entity.Meetingpub;
import com.jacky.Service.MeetingpubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meeting")
public class MeetingpubController {

    @Autowired
    MeetingpubService meetingpubService;

    @RequestMapping(value = "/{id}")
    public Meetingpub selectIdMeeting(@PathVariable("id") Integer id){
        return meetingpubService.selectMeetingId(id);
    }

}
