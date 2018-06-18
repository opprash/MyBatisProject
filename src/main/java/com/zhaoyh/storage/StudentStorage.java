package com.zhaoyh.storage;
import com.zhaoyh.model.Student;
import com.zhaoyh.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentStorage {

    /**
     * 插入用户
     * @param StudentName
     * @param phone
     */
    void addStudent(@Param("name") String StudentName, @Param("phone") int phone);

    /**
     * 查询用户列表
     * @param phone
     * @return
     */
    List<Student> queryStudentByPhone(@Param("phone") int phone);

}
