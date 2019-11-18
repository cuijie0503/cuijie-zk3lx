package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
    * @ClassName HeTongProviderApplication.java
    * @Description //服务启动类
    * @Author 崔杰
    * @Date 2019/11/18 9:02
    * @Version 1.0
    **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing
public class HeTongProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(HeTongProviderApplication.class, args);
    }


}
