package com.cuijie.demo.controller;

import com.cuijie.demo.bean.HuiKuan;
import com.cuijie.demo.bean.ObjectVo;
import com.cuijie.demo.dao.HeTongDao;
import com.cuijie.demo.dao.HuiKuanDao;
import com.cuijie.demo.service.HuiKuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;

@RestController
@RequestMapping("/hetong")
@CrossOrigin
public class HeTongController {

    @Autowired
    HuiKuanDao huiKuanDao;
    @Autowired
    HeTongDao heTongDao;
    @Autowired
    HuiKuanService huiKuanService;


    @RequestMapping("/list")
    public Page<HuiKuan> list(@RequestParam(defaultValue = "0") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize, ObjectVo objectVo) {

        PageRequest page = PageRequest.of(pageNum, pageSize);

        Page<HuiKuan> all = huiKuanDao.findAll(page);
        return all;

    }


    @RequestMapping("/del")
    public boolean del(String[] id) {

        if(id!=null){

            for (String s : id) {
                Integer integer = Integer.valueOf(s);
                huiKuanDao.deleteHuiKuanById(integer);
            }
        }

        return true;
    }

    @PostMapping("/save")
    public boolean save(@RequestBody HuiKuan huiKuan) {
        boolean save = huiKuanService.save(huiKuan);
        return save;
    }

}
