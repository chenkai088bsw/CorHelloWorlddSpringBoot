package com.atguigu.Mybatis.Mapper;


import com.atguigu.Mybatis.Bean.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper {
    public Order getOrderById(Integer id);
    public void insertOrder();
}
