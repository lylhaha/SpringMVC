package com.lyl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2016/9/29.
 */
@Controller
public class mvcController {

    @RequestMapping("/helloWord")
    public String hello(){
        return "helloWord";
    }
}
