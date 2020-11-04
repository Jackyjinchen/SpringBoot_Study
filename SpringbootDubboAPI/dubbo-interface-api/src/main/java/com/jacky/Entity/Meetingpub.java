package com.jacky.Entity;


import java.io.Serializable;

public class Meetingpub implements Serializable {
    private Integer id;

    private Integer pcode;

    private String title;

    private Integer uid;

    private String content;

    private Student student;

    @Override
    public String toString() {
        return "Meetingpub{" +
                "id=" + id +
                ", pcode=" + pcode +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                ", student=" + student +
                '}';
    }

    public Meetingpub(Integer id, Integer pcode, String title, Integer uid, String content) {
        this.id = id;
        this.pcode = pcode;
        this.title = title;
        this.uid = uid;
        this.content = content;
    }

    public Meetingpub() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPcode() {
        return pcode;
    }

    public void setPcode(Integer pcode) {
        this.pcode = pcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}