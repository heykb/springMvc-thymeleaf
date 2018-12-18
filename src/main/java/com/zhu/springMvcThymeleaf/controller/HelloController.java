package com.zhu.springMvcThymeleaf.controller;

import com.zhu.springMvcThymeleaf.domain.User;
import com.zhu.springMvcThymeleaf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HelloController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/")
    public String hello(Model model){
        List<User> users = userMapper.selectAll();
        System.out.println(users);
        model.addAttribute("users",users);
        return "hello";
    }
}
