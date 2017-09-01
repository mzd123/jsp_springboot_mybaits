package com.mzd.springboot_web_jsp.server;

import com.mzd.springboot_web_jsp.bean.Teacher;
import com.mzd.springboot_web_jsp.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public Teacher selectteacherS() {
        Teacher teacher = new Teacher();
        List<Teacher> list = teacherDao.selectteacherD();
        if (list.size() > 0) {
            teacher = list.get(0);
        }
        return teacher;
    }
}
