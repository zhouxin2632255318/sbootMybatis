package com.example.sbootmybatis.controller;

import com.example.sbootmybatis.entity.Student;
import com.example.sbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService stuService;

    @RequestMapping(value = "/index")
    public String index(Model model){
        String name = "zhouxin";
        model.addAttribute("name", name);
        return "student";
    }

    @RequestMapping(value = "/findStudent",method = RequestMethod.POST)
    @ResponseBody
    public Student findStudent(int id){
        return stuService.findById(id);
    }
}
