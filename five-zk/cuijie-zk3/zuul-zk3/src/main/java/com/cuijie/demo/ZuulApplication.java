package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
    * @ClassName ZuulApplication.java
    * @Description //网关启动类
    * @Author 崔杰
    * @Date 2019/11/18 9:26
    * @Version 1.0
    **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
