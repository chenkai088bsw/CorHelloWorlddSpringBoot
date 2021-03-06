package com.atguigu;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登陆检查的拦截器
/**
 * 没有登陆的用户不能访问后台主页
 */
public class LoginHandlerIntercepter implements HandlerInterceptor{//要实现拦截器，必须实现HandlerInterceptor接口
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Object user = request.getSession().getAttribute("loginUser");
       if(user==null){
           //未登陆，返回登陆页面
           request.setAttribute("msg","没有权限请先登陆");
           request.getRequestDispatcher("/login.html").forward(request,response);
           return false;
       }
       //已经登陆，放行请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
