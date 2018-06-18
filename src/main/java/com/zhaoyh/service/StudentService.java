package com.zhaoyh.service;

import com.zhaoyh.model.Student;
import com.zhaoyh.storage.StudentStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentStorage studentStorage;
    public void addStudent(Student student){
        studentStorage.addStudent(student.getName(),student.getPhone());
    }
    public List<Student> getStudentByPhone(int phone) {
        return studentStorage.queryStudentByPhone(phone);
    }
}
