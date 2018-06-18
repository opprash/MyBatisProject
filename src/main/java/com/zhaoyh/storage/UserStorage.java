package com.zhaoyh.storage;

import com.zhaoyh.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserStorage {

    /**
     * �����û�
     * @param userName
     * @param phone
     */
    void addUser(@Param("name") String userName, @Param("phone") String phone);

    /**
     * ��ѯ�û��б�
     * @param phone
     * @return
     */
    List<User> queryUserByPhone(@Param("phone") String phone);

}