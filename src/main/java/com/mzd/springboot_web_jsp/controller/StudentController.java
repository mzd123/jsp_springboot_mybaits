package com.mzd.springboot_web_jsp.controller;

import com.mzd.springboot_web_jsp.bean.Teacher;
import com.mzd.springboot_web_jsp.bean.generator.Student;
import com.mzd.springboot_web_jsp.server.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController：慎用，他会将所有返回的数据解析为json字符串，如果要返回的是跳转页面，就不能使用@RestController
@Controller
@Api("student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //method如果不写的话，swagger中将会有7种请求方式，delete、get、head、options、patch、post和put-----老师的controller就没写，可以看看老师的swagger
    @RequestMapping(value = "/api/selectstudent", method = RequestMethod.GET)
    @ApiOperation("查询学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuid", value = "学生id", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "stuname", value = "学生名字", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "stusex", value = "学生性别", required = true, dataType = "String", paramType = "query")
    })
    public String selectstudent(Model model) {
        Student student = studentService.selectStudentS();
        model.addAttribute("student", student);
        return "success";
    }


}
