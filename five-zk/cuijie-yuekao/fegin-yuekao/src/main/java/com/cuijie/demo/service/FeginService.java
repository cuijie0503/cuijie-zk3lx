package com.cuijie.demo.service;

import com.cuijie.demo.bean.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-provider")
@Transactional
public interface FeginService {

    //列表
    @RequestMapping("/order/list")
    public Page list(Orders orders, @RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize);


}
