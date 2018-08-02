package com.icourt.mybatis1.mapper;

import com.icourt.mybatis1.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: icourt
 * @date: 2018/8/2 11:27
 * @description:
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE name=#{name} and password=#{password}")
    User login(@Param("name") String name, @Param("password") String password);

    @Select("select * from user")
    List<User> findAll();

    @Delete("delete from user where name=#{name}")
    void delete(@Param("name") String name);

    @Update("update user set name=#{name},password=#{password} where id=#{id}")
    void update(@Param("id") int id, @Param("name") String name, @Param("password") String password);
}
