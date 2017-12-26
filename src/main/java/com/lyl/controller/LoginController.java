package com.lyl.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * Created by user on 2016/9/27.
 */
public class LoginController extends MultiActionController {
    private Logger logger=Logger.getLogger(this.getClass().getName());

    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        ModelAndView modelAndView=new ModelAndView();
        if ("1".equals(account)&&"1".equals(password)){
            modelAndView.setViewName("gc/success");

        }else{
            modelAndView.addObject("status","账户或密码有错");
            modelAndView.setViewName("login");
        }
        return modelAndView;


    }
}
