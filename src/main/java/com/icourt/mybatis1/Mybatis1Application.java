package com.icourt.mybatis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author icourt
 */
@SpringBootApplication
@MapperScan("/com/icourt/mybatis1/mapper")
public class Mybatis1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis1Application.class, args);
    }




}
