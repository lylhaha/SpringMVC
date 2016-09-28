package com.lyl.controller;


import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.lyl.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by user on 2016/9/23.
 */
public class FormController extends SimpleFormController {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private String viewPage;


    public String getViewPage() {
        return viewPage;
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }

//    public ModelAndView onSubmit(Object command) throws Exception {
//       HelloWorl= (HelloWorld) command;
//        Map model = new HashMap();
//        model.put("helloWord", helloWorld.getMsg());
//        return new ModelAndView(getViewPage(),model);
//
//    }
}
