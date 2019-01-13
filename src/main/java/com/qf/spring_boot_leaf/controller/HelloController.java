package com.qf.spring_boot_leaf.controller;

import com.qf.spring_boot_leaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public  String hello(Model model){
        model.addAttribute("name","小黑");
        List<User> list=new ArrayList<>();
        User user =new User();
        user.setId(1);
        user.setName("小王");
        user.setAge(20);
        list.add(user);
        User user1 =new User();
        user1.setId(1);
        user1.setName("小热");
        user1.setAge(23);
        list.add(user1);
        User user2 =new User();
        user2.setId(1);
        user2.setName("小高");
        user2.setAge(12);
        list.add(user2);
        model.addAttribute("users",list);
        model.addAttribute("age",10);
        model.addAttribute( "now" ,new Date());
        return "hello";
    }
}
