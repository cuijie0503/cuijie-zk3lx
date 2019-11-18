package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FeginApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeginApplication.class,args);
    }

}
