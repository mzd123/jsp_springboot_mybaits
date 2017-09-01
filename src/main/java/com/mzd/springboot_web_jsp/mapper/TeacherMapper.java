package com.mzd.springboot_web_jsp.mapper;

import com.mzd.springboot_web_jsp.bean.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectteacherM(String teaid);
}
