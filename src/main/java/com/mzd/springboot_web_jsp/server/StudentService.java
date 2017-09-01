package com.mzd.springboot_web_jsp.server;

import com.mzd.springboot_web_jsp.bean.Teacher;
import com.mzd.springboot_web_jsp.bean.generator.Student;
import com.mzd.springboot_web_jsp.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student selectStudentS() {
        Student student = new Student();
        List list = studentDao.selectStudentD();
        if (list.size() > 0) {
            student = (Student) list.get(0);
        }
        return student;
    }


}
