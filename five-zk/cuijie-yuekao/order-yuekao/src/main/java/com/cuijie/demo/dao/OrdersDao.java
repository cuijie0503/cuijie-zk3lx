package com.cuijie.demo.dao;

import com.cuijie.demo.bean.Orders;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/**
    * @ClassName OrdersDao.java
    * @Description //订单头接口
    * @Author
    * @Date 2019/11/26 17:29
    * @Version 1.0
    **/
public interface OrdersDao extends JpaRepository<Orders,Integer>, JpaSpecificationExecutor<Orders> {
}
