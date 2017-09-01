package com.mzd.springboot_web_jsp.bean;

import com.mzd.springboot_web_jsp.bean.generator.Student;
import lombok.Data;

import java.util.List;

//@Data:能自动生成get-set
@Data
public class Teacher {
    private String teaid;
    private String teaname;
    private List<Student> list;
}
