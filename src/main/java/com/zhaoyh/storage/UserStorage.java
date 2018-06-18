package com.zhaoyh.storage;

import com.zhaoyh.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserStorage {

    /**
     * 插入用户
     * @param userName
     * @param phone
     */
    void addUser(@Param("name") String userName, @Param("phone") String phone);

    /**
     * 查询用户列表
     * @param phone
     * @return
     */
    List<User> queryUserByPhone(@Param("phone") String phone);

}