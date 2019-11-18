package com.cuijie.demo.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "hetong-provider")
public interface FeginService {




}
