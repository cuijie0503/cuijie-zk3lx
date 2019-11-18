package com.cuijie.demo.service;

import com.cuijie.demo.bean.HuiKuan;
import com.cuijie.demo.bean.ObjectVo;
import com.cuijie.demo.dao.HeTongDao;
import com.cuijie.demo.dao.HuiKuanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HeTongServiceImpl implements HeTongService {
    @Autowired
    HeTongDao heTongDao;





}
