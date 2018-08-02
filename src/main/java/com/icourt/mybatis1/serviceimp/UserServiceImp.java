package com.icourt.mybatis1.serviceimp;

import com.icourt.mybatis1.entity.User;
import com.icourt.mybatis1.mapper.UserMapper;
import com.icourt.mybatis1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: icourt
 * @date: 2018/8/2 12:18
 * @description:
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String name, String password) {
    User user = new User();
    user = userMapper.login(name, password);
    return user;
    }

    @Override
    public List<User> findALL() {
        return userMapper.findAll();
    }

    @Override
    public void delete(String name) {
        userMapper.delete(name);
    }

    @Override
    public void update(int id, String name, String password) {
        userMapper.update(id, name, password);
    }


}
