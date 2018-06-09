package com.rain.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        System.out.print("项目初始化！");

        SpringApplication.run(ApiApplication.class, args);
    }
}
