package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName YEurekaApplication.java
 * @Description //eureka 注册中心
 * @Author
 * @Date 2019/11/26 13:43
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class YEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YEurekaApplication.class, args);
    }
}
