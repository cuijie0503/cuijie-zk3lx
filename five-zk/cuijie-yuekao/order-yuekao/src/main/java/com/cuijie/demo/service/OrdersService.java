package com.cuijie.demo.service;

import com.cuijie.demo.bean.Orders;
import com.cuijie.demo.dao.OrderDescDao;
import com.cuijie.demo.dao.OrdersDao;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

/**
 * @ClassName OrdersService.java
 * @Description //订单接口
 * @Author
 * @Date 2019/11/26 17:29
 * @Version 1.0
 **/
@Service
@Transactional
public class OrdersService {

    @Autowired
    OrdersDao ordersDao;
    @Autowired
    OrderDescDao orderDescDao;

    //列表
    public Page list(Orders orders, Integer pageNum, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        Specification<Orders> specification = new Specification<Orders>() {
            @Override
            public Predicate toPredicate(Root<Orders> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cd) {
                ArrayList<Predicate> predicates = new ArrayList<>();
                if (orders.getOid() != null) {
                    Predicate oid = cd.like(root.get("oid"), "%" + orders.getOid() + "%");
                    predicates.add(oid);

                }

                if (!StringUtils.isEmpty(orders.getPeoples())) {

                    Predicate peoples = cd.like(root.get("peoples"), "%" + orders.getPeoples() + "%");
                    predicates.add(peoples);

                }

                if (!StringUtils.isEmpty(orders.getPhone())) {

                    Predicate phone = cd.like(root.get("phone"), "%" + orders.getPhone() + "%");
                    predicates.add(phone);

                }

                if (!StringUtils.isEmpty(orders.getStartFahuoTime()) && !StringUtils.isEmpty(orders.getEndFahuoTime())) {

                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date date1 = simpleDateFormat.parse(orders.getStartFahuoTime());
                        Date date2 = simpleDateFormat.parse(orders.getEndFahuoTime());

                        Predicate fahuo_time = cd.between(root.get("fahuoTime"), date1, date2);
                        predicates.add(fahuo_time);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }

                if (!StringUtils.isEmpty(orders.getStartShouhuoTime()) && !StringUtils.isEmpty(orders.getEndShouhuoTime())) {

                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date date1 = simpleDateFormat.parse(orders.getStartShouhuoTime());
                        Date date2 = simpleDateFormat.parse(orders.getEndShouhuoTime());

                        Predicate shouhuo_time = cd.between(root.get("shouhuoTime"), date1, date2);
                        predicates.add(shouhuo_time);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
                Predicate[] predicates1 = new Predicate[predicates.size()];
                Predicate[] predicates2 = predicates.toArray(predicates1);
                Predicate and = cd.and(predicates2);
                return and;

            }

        };


        return ordersDao.findAll(specification, pageRequest);
    }


    public boolean del(String id) {

        try {
            if (id.contains(",")) {
                String[] split = id.split(",");
                for (String s : split) {
                    //删除明细表
                    orderDescDao.deleteByOid(Integer.valueOf(s));
                    //删除订单头表
                    ordersDao.deleteById(Integer.valueOf(s));
                }
                return true;
            } else {
                //删除明细表
                orderDescDao.deleteByOid(Integer.valueOf(id));
                //删除订单头表
                ordersDao.deleteById(Integer.valueOf(id));
                return true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean save(Orders orders) {

        try {
            if (orders.getOid() != null) {
                ordersDao.save(orders);
                return true;
            } else {
                ordersDao.save(orders);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;


    }

    public Orders find(Integer id) {

        Optional<Orders> byId = ordersDao.findById(id);
        return byId.get();

    }
}
