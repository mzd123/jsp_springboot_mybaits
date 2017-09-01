package com.mzd.springboot_web_jsp.controller;

import com.mzd.springboot_web_jsp.bean.Teacher;
import com.mzd.springboot_web_jsp.server.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/api/selectteacher")
    @ApiOperation("查询老师")
    public String selectteacher(HttpServletRequest request) {
        Teacher teacher = teacherService.selectteacherS();
        request.getSession().setAttribute("teacher", teacher);
        return "teachershow";
    }
}
