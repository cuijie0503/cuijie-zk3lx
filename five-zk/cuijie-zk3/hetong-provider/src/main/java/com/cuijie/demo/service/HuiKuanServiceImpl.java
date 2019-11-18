package com.cuijie.demo.service;

import com.cuijie.demo.bean.HuiKuan;
import com.cuijie.demo.bean.ObjectVo;
import com.cuijie.demo.dao.HeTongDao;
import com.cuijie.demo.dao.HuiKuanDao;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;

@Service
@Transactional
public class HuiKuanServiceImpl implements HuiKuanService {
    @Autowired
    HuiKuanDao huiKuanDao;
    @Autowired
    HeTongDao heTongDao;

    @Override
    public Page<HuiKuan> selectHuiKuanList(Pageable pageable, ObjectVo objectVo) {

/*
        Specification<HuiKuan> specification = new Specification<HuiKuan>() {
            @Override
            public Predicate toPredicate(Root<HuiKuan> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

                ArrayList<Predicate> predicates = new ArrayList<>();

                Predicate[] predicates1 = new Predicate[predicates.size()];
                Predicate[] predicates2 = predicates.toArray(predicates1);

                predicates.add()
                return null;
            }
        };    }*/

        /* return  huiKuanDao.findAll(specification,pageable);*/
        return null;
    }

    @Override
    public boolean del(String[] id) {

        try {


            if (id != null) {
                for (String s : id) {

                    huiKuanDao.deleteById(s);
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean save(HuiKuan huiKuan) {
        try {
            HuiKuan save = huiKuanDao.save(huiKuan);
            if (save != null) {

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
