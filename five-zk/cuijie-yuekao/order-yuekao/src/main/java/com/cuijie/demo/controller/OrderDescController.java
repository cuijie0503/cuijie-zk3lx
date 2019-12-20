package com.cuijie.demo.controller;

import com.cuijie.demo.bean.OrderDescs;
import com.cuijie.demo.bean.Orders;
import com.cuijie.demo.dao.OrderDescDao;
import com.cuijie.demo.dao.OrdersDao;
import com.cuijie.demo.service.OrderDescService;
import com.cuijie.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName OrderDescController.java
 * @Description //订单明细控制层
 * @Author
 * @Date 2019/11/26 17:28
 * @Version 1.0
 **/
@RestController
@RequestMapping("/orderDesc")
@CrossOrigin
public class OrderDescController {

    @Autowired
    OrderDescService orderDescService;
    @Autowired
    OrdersService ordersService;
    @Autowired
    OrdersDao ordersDao;
    @Autowired
    OrderDescDao orderDescDao;

    //列表
    @RequestMapping("/descList")
    public List<OrderDescs> list(Integer id) {

        List<OrderDescs> list = orderDescService.list(id);
        return list;
    }

    //查询回显
    @RequestMapping("/eidt")
    public Orders eidt(Integer id) {
        Orders orders = ordersService.find(id);
        return orders;
    }

    //查询回显
    @RequestMapping("/eidt2")
    public OrderDescs eidt2(Integer id) {
        Optional<OrderDescs> byId = orderDescDao.findById(id);
        return byId.get();
    }

    //删除/批删
    @RequestMapping("/del")
    public boolean del(String id) {
        boolean del = orderDescService.del(id);
        return del;
    }


    //添加订单表头
    @RequestMapping("/save")
    public boolean save(OrderDescs orderDescs) {
        boolean save = orderDescService.save(orderDescs);
        return save;
    }


}
