package com.mzd.springboot_web_jsp.mapper.generator;

import com.mzd.springboot_web_jsp.bean.generator.Student;
import com.mzd.springboot_web_jsp.bean.generator.StudentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//通过generator插件自动生成的
public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);
}