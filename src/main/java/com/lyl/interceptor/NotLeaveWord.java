package com.lyl.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by user on 2016/9/27.
 */
public class NotLeaveWord extends HandlerInterceptorAdapter {


    /**
     * 在执行具体转发钱截取
     *
     * @param request
     * @param response
     * @param handler
     * @return true:处理器将继续执行
     *          false:拦截器继续执行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取当前时间
        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        if(hour>=8&&hour<10){
            response.sendRedirect("http://localhost:8080/jlerp/index.jsp");
            return  false;
        }else {
            return true;
        }
    }
}
