package com.gongan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gongan.dao")
public class GonganApplication {

    public static void main(String[] args) {
        SpringApplication.run(GonganApplication.class, args);
    }
}
