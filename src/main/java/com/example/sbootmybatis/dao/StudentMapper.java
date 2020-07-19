package com.example.sbootmybatis.dao;

import com.example.sbootmybatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {

    public Student findById(@Param("id") int id);

    public void saveStudent(Student student);

}
