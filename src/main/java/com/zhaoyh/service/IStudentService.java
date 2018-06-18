package com.zhaoyh.service;

import com.zhaoyh.model.Student;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    List<Student> getStudentByPhone(int phone);
}
