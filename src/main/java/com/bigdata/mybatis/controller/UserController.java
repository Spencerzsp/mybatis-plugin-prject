package com.bigdata.mybatis.controller;

import com.bigdata.mybatis.bean.User;
import com.bigdata.mybatis.mapper.UserMapper;
import com.bigdata.mybatis.service.UserService;
import com.bigdata.mybatis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String test(){
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user);
        }
        return users.toString();
    }

}
