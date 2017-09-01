package com.mzd.springboot_web_jsp.dao;

import com.mzd.springboot_web_jsp.bean.Teacher;
import com.mzd.springboot_web_jsp.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherDao {
    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> selectteacherD() {
        String teaid = "q";
        return teacherMapper.selectteacherM(teaid);
    }
}
