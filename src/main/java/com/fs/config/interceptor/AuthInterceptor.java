package com.fs.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fengsong on 2017/3/9.
 */

public class AuthInterceptor implements HandlerInterceptor {

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AuthInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //打印请求参数信息
        logger.info("REQUEST_URL:---" + request.getRequestURI() + "----");
        logger.info("REQUEST_PARAMS:---" + request.getParameterMap() + "----");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        if (modelAndView == null) {
            modelAndView = new ModelAndView();

        }


        modelAndView.addObject("basePath", "http://localhost:8008/bar");

        //获取返回对象的国际化信息
        //System.out.print(JSON.toJSONString(response));
 /*       if(request.getRequestURI().contains("member")&&request.getSession().getAttribute("member")==null){
            response.sendRedirect("../login/toLogin");
        }*/


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
