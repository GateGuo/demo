package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author changyuan.guo@hand-china.com
 * @Title GlobalExceptionHandler
 * @Description
 * @date 2019/03/13
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView defaultHandler(HttpServletRequest request, Exception e) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("statusCode", "501");
        modelAndView.addObject("exception", e);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
