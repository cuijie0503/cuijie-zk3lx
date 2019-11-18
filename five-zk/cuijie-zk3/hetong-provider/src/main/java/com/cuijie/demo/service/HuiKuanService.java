package com.cuijie.demo.service;

import com.cuijie.demo.bean.HuiKuan;
import com.cuijie.demo.bean.ObjectVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @InterfaceName HuiKuanService.java
 * @Description //回款业务层
 * @Author 崔杰
 * @Date 2019/11/18 9:10
 * @Version 1.0
 **/
public interface HuiKuanService {
    //查询列表
    Page<HuiKuan> selectHuiKuanList(Pageable pageable, ObjectVo objectVo);

    //删除
    boolean del(String[] id);

    //添加
    boolean save(HuiKuan huiKuan);
}
