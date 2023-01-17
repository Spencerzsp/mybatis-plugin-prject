package com.bigdata.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bigdata.mybatis.mapper")
public class APIApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIApplication.class);
    }
}
