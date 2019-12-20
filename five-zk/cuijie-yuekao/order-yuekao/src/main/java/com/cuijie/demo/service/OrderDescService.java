package com.cuijie.demo.service;

import com.cuijie.demo.bean.OrderDescs;
import com.cuijie.demo.dao.OrderDescDao;
import com.cuijie.demo.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
/**
    * @ClassName OrderDescService.java
    * @Description //订单明细接口
    * @Author
    * @Date 2019/11/26 17:29
    * @Version 1.0
    **/
@Service
@Transactional
public class OrderDescService {

    @Autowired
    OrdersDao ordersDao;
    @Autowired
    OrderDescDao orderDescDao;

    //列表
    public List<OrderDescs> list(Integer id) {

        List<OrderDescs> allByOid = orderDescDao.findAllByOid(id);
        return allByOid;

    }
    //删除
    public boolean del(String id) {
        try {
            if (id.contains(",")) {
                String[] split = id.split(",");
                for (String s : split) {
                    //删除明细表
                    orderDescDao.deleteById(Integer.valueOf(s));
                }
                return true;
            } else {
                //删除明细表
                orderDescDao.deleteById(Integer.valueOf(id));
                return true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return false;
    }
    //添加/修改
    public boolean save(OrderDescs orderDescs) {


        try {
            if (orderDescs.getSid() != null) {
                System.out.println(
                        "修改"+orderDescs
                );
               orderDescDao.update(orderDescs.getName(), orderDescs.getType(), orderDescs.getSongzhi(), orderDescs.getShuliang(),orderDescs.getShouzhi(), orderDescs.getShijiday(), orderDescs.getDescs(), orderDescs.getYujiday(), orderDescs.getOidss(),orderDescs.getSid());
                return true;
            } else {
                System.out.println(
                        "添加"+orderDescs
                );
                orderDescDao.insert(orderDescs.getName(), orderDescs.getType(), orderDescs.getSongzhi(), orderDescs.getShuliang(), orderDescs.getShouzhi(), orderDescs.getShijiday(), orderDescs.getDescs(), orderDescs.getYujiday(), orderDescs.getOidss());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;


    }
}
