package com.icourt.mybatis1.service;

import com.icourt.mybatis1.entity.User;

import java.util.List;

/**
 * @author: icourt
 * @date: 2018/8/2 12:17
 * @description:
 */
public interface UserService {
    User login(String name, String password);
    List<User> findALL();
    void delete(String name);
    void update(int id, String name, String password);
}
