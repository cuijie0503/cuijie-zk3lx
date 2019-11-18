package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication.java
 * @Description //注册中心启动类
 * @Author 崔杰
 * @Date 2019/11/18 9:32
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {


    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);

    }

}
