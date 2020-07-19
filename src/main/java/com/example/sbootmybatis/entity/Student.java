package com.example.sbootmybatis.entity;

import java.util.List;

/**
 * 学生类
 */
public class Student extends AbstractBaseEntity {

    /**
     * 学生名称
     */
    private String name;

    /**
     * 学生性别
     */
    private String sex;

    /**
     * 学生所选课程集合
     */
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
