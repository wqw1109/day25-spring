package com.wqw.study.ioc.web;

import com.wqw.study.ioc.bean.User;
import com.wqw.study.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServlet {
    @Autowired
    private UserService userService;

    public User get(){
        return userService.get();
    }
}
