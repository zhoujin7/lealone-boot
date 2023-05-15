package com.example.lealoneboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class LealoneBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LealoneBootApplication.class, args);
    }

}
