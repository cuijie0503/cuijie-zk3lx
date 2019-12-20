package com.cuijie.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @ClassName OrderDescs.java
 * @Description //订单明细实体类
 * @Author
 * @Date 2019/11/26 17:37
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
@Entity
@Table(name = "t_orderDesc")
public class OrderDescs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    private String name;
    private String type;
    private Integer shuliang;
    private String shouzhi;
    private String songzhi;
    private Integer yujiday;
    private Integer shijiday;
    private String descs;
    private Integer oidss;


}
