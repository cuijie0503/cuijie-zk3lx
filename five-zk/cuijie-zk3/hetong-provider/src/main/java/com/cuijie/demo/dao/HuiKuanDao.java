package com.cuijie.demo.dao;

import com.cuijie.demo.bean.HuiKuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @InterfaceName HuiKuanDao.java
 * @Description //汇款持久层
 * @Author 崔杰
 * @Date 2019/11/18 9:09
 * @Version 1.0
 **/
@Transactional
public interface HuiKuanDao extends JpaRepository<HuiKuan, String>, JpaSpecificationExecutor {

    @Query(nativeQuery = true, value = "delete from t_huikuan where id in (:id)")
    @Modifying
    int deleteHuiKuanById(@Param("id") Integer id);
}
