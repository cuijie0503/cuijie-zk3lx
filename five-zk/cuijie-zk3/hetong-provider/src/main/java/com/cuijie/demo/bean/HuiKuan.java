package com.cuijie.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name ="t_huikuan")
public class HuiKuan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private BigDecimal hetongPrice;
    private BigDecimal yuePrice;
    private String huikuanNum;
    private Date huikuanTime;
    private String shoukuanPeople;
    private String huikuanDis;
    @ManyToOne
    @JoinColumn(name = "hetongId")
    private HeTong heTong;


}
