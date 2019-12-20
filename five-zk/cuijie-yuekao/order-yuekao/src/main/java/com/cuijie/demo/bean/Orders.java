package com.cuijie.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Orders.java
 * @Description //订单实体类
 * @Author
 * @Date 2019/11/26 17:28
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
@Entity
@Table(name = "t_orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid;
    private String peoples;
    private String phone;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date shouhuoTime;
    private String startShouhuoTime;
    private String endShouhuoTime;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fahuoTime;
    private String startFahuoTime;
    private String endFahuoTime;


    private String wuliuId;
    @OneToMany
    @JoinColumn(name = "oid", referencedColumnName = "oid")
    private List<OrderDescs> orderDescsList;


}
