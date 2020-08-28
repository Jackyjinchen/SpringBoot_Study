package com.jacky.Dao;

import com.jacky.Entity.Meetingpub;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MeetingpubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Meetingpub record);

    int insertSelective(Meetingpub record);

    Meetingpub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Meetingpub record);

    int updateByPrimaryKey(Meetingpub record);
}