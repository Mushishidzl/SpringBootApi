package com.rain.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringBootApi
 * @description: 启动入口
 * @author: Mushishi
 * @create: 2018-06-11 10:44
 **/
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        System.out.print("项目初始化！");

        SpringApplication.run(ApiApplication.class, args);
    }
}
