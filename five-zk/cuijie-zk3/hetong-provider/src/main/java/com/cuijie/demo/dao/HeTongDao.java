package com.cuijie.demo.dao;

import com.cuijie.demo.bean.HeTong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/**
    * @InterfaceName HeTongDao.java
    * @Description //合同持久层
    * @Author 崔杰
    * @Date 2019/11/18 9:09
    * @Version 1.0
    **/
public interface HeTongDao extends JpaRepository<HeTong,String>, JpaSpecificationExecutor {
}
