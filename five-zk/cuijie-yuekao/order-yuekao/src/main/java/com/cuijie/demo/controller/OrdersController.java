package com.cuijie.demo.controller;

import com.cuijie.demo.bean.Orders;
import com.cuijie.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
/**
    * @ClassName OrdersController.java
    * @Description //订单控制层
    * @Author
    * @Date 2019/11/26 17:28
    * @Version 1.0
    **/
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    //列表
    @RequestMapping("/list")
    public Page list(Orders orders, @RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize) {
        Page list = ordersService.list(orders, pageNum, pageSize);
        return list;
    }

    //删除/批删
    @RequestMapping("/del")
    public boolean del(String id) {
        boolean del = ordersService.del(id);
        return del;
    }

    //添加订单表头
    @RequestMapping("/save")
    public boolean save(Orders orders) {
        boolean save = ordersService.save(orders);
        return save;
    }

    //添加订单表头
    @RequestMapping("/eidt")
    public Orders eidt(Integer id) {
        Orders orders = ordersService.find(id);
        return orders;
    }


}
