package com.qf.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping(value = "/login")
    public String login(String username,String password){

        return "index";
    }


    @RequestMapping(value = "/topage/{page}")
    public  String toPage(@PathVariable String page){
        return page;
    }
}
