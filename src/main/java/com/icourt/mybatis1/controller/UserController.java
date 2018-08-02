package com.icourt.mybatis1.controller;

import com.icourt.mybatis1.entity.User;
import com.icourt.mybatis1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/**
 * @author: icourt
 * @date: 2018/8/2 12:25
 * @description:
 */
@Api(tags = "用户管理接口")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public String  login(@RequestBody User user) {
        User userResult  = userService.login(user.getName(), user.getPassword());
        //todo jwt token
        if (Objects.isNull(userResult)) {
            return "error";

        }

        return "success";
    }

    @ApiOperation("获取所有用户信息")
    @GetMapping("/select")
    public List<User> getAll(){
        List<User> userList = userService.findALL();
        return userList;
    }
    @ApiOperation("删除用户根据名字")
    @PostMapping("/delete")
    public void delete(@RequestBody User user) {
        userService.delete(user.getName());
    }
    @ApiOperation("根据ID修改用户信息")
    @PostMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user.getId(), user.getName(), user.getPassword());
    }
}
