package com.cuijie.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name ="t_hetong")
public class HeTong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String kehuId;
    private BigDecimal hetongPrice;
    private String httongDis;

}
