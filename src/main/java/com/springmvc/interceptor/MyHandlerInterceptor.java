package com.springmvc.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 拦截器
 */
public class MyHandlerInterceptor implements HandlerInterceptor {
    /**
     * 前端事件
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("HandlerInterceptor1....preHandle");
        //false表示拦截，不向下执行；true表示放行
        return true;
    }
    /**
     * 后端事件
     */
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o,
                           ModelAndView modelAndView) throws Exception {
        System.out.println(o.toString());

    }
    /**
     * 完成事件
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("HandlerInterceptor1....afterCompletion");
    }
}
