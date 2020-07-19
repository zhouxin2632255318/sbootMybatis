package com.example.sbootmybatis.entity;

/**
 * 学生课程分数
 */
public class CourseScore extends AbstractBaseEntity{

    private int studentId;

    private int courseId;

    private String score;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
