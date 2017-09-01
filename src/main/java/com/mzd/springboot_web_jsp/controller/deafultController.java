package com.mzd.springboot_web_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class deafultController {
    //配置springboot的默认首页
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
