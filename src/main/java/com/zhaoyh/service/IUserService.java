package com.zhaoyh.service;

import com.zhaoyh.model.User;

import java.util.List;
public interface IUserService {

    void addUser(User user);

    List<User> getUserByPhone(String phone);
}