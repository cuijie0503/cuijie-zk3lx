package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
    * @ClassName OrderApplication.java
    * @Description //订单服务
    * @Author
    * @Date 2019/11/26 17:29
    * @Version 1.0
    **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class, args);
    }
}
