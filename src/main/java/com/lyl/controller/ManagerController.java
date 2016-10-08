package com.lyl.controller;


import com.lyl.model.Manager;

import com.lyl.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by user on 2016/10/8.
*/
@Controller
public class ManagerController {

@Resource
    ManagerService managerService;

    @RequestMapping("/manager")
    public String test(){

      List<Manager> managers= managerService.selectManager();
        System.out.println(managers);


       return "helloWord";
    }
}
