package com.cuijie.demo;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
/**
    * @ClassName FeginApplication.java
    * @Description //Fegin远程调用
    * @Author
    * @Date 2019/11/26 14:27
    * @Version 1.0
    **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeginApplication {

    @Bean
    @LoadBalanced
    public IRule myRule() {

        return new RandomRule();

    }


    public static void main(String[] args) {

        SpringApplication.run(FeginApplication.class, args);
    }

}
