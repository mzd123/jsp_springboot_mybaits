package com.mzd.springboot_web_jsp.dao;

import com.mzd.springboot_web_jsp.bean.generator.StudentExample;
import com.mzd.springboot_web_jsp.mapper.generator.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private StudentMapper studentMapper;

    public List selectStudentD() {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStusexEqualTo("男");
        return studentMapper.selectByExample(studentExample);
    }
}
