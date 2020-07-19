package com.example.sbootmybatis.entity;

/**
 * 课程类
 */
public class Course extends AbstractBaseEntity{

    private String name;

    /**
     * 课程成绩
     */
    private CourseScore courseScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseScore getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(CourseScore courseScore) {
        this.courseScore = courseScore;
    }
}
