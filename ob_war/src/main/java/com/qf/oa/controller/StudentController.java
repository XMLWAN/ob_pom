package com.qf.oa.controller;

import com.qf.entity.Student;
import com.qf.oa.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/stu")
public class StudentController {

    @Autowired
    private IStuService stuService;

    @RequestMapping(value = "/queryAll")
    public  String queryAll(Model model){
        List<Student> students = stuService.queryAll();
        model.addAttribute("students",students);
        return "stulist";
    }
}
