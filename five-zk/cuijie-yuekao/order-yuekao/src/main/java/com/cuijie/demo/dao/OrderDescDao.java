package com.cuijie.demo.dao;

import com.cuijie.demo.bean.OrderDescs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
/**
    * @InterfaceName OrderDescDao.java
    * @Description //订单明细接口
    * @Author
    * @Date 2019/11/26 17:29
    * @Version 1.0
    **/
public interface OrderDescDao extends JpaRepository<OrderDescs, Integer>, JpaSpecificationExecutor<OrderDescs> {


    @Query(nativeQuery = true, value = "delete from t_order_desc where oid =:oid")
    @Modifying
    void deleteByOid(@Param("oid") Integer s);

    @Query(nativeQuery = true, value = "select * from t_order_desc where oid =:oid")
    @Modifying
    List<OrderDescs> findAllByOid(@Param("oid") Integer oid);

    @Query(nativeQuery = true, value = "update t_order_desc set descs=:descs, name=:name, shijiday=:shijiday, shouzhi=:shouzhi, shuliang=:shuliang,shouzhi=:shouzhi ,songzhi=:songzhi, type=:type, yujiday=:yujiday,oid=:oid where sid=:sid")
    @Modifying
    void update(@Param("name") String name, @Param("type") String type, @Param("songzhi") String songzhi, @Param("shuliang") Integer shuliang,@Param("shouzhi") String shouzhi, @Param("shijiday") Integer shijiday, @Param("descs") String descs, @Param("yujiday") Integer yujiday, @Param("oid") Integer oidss, @Param("sid") Integer sid);

    @Query(nativeQuery = true, value = "insert into t_order_desc set descs=:descs, name=:name, shijiday=:shijiday, shouzhi=:shouzhi, shuliang=:shuliang,,shouzhi=:shouzhi , songzhi=:songzhi, type=:type, yujiday=:yujiday,oid=:oid")
    @Modifying
    void insert(@Param("name") String name, @Param("type") String type, @Param("songzhi") String songzhi, @Param("shuliang") Integer shuliang, @Param("shouzhi") String shouzhi, @Param("shijiday") Integer shijiday, @Param("descs") String descs, @Param("yujiday") Integer yujiday, @Param("oid") Integer oidss);


}
