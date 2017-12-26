package com.lyl.controller;

import com.lyl.model.User;
import com.lyl.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 2016/10/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping("/showUser")
    public String showUser(String id, HttpServletRequest request) {
        User user = userService.getUserById(Integer.parseInt(id));
        request.setAttribute("user", user);
        return "showUser";
    }
}
