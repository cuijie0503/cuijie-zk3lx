package com.cuijie.demo.controller;

import com.cuijie.demo.bean.Orders;
import com.cuijie.demo.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
    * @InterfaceName FeginController.java
    * @Description //fegin调用
    * @Author
    * @Date 2019/11/26 17:37
    * @Version 1.0
    **/
@RestController
@RequestMapping("/fegin")
public class FeginController {
    @Resource
    FeginService feginService;


    @RequestMapping("/list")
    public Page list() {
        Orders orders = new Orders();
        Page list = feginService.list(orders, 0, 3);
        return list;
    }


}
