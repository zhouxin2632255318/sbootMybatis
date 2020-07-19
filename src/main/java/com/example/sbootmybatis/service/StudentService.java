package com.example.sbootmybatis.service;

import com.example.sbootmybatis.dao.StudentMapper;
import com.example.sbootmybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper stuMapper;

    public Student findById(int id){
        return stuMapper.findById(id);
    }

}