package com.atguigu.Mybatis.controller;

import com.atguigu.Mybatis.Bean.Order;
import com.atguigu.Mybatis.Bean.User;
import com.atguigu.Mybatis.Mapper.ApplyInfoMapper;
import com.atguigu.Mybatis.Mapper.OrdersMapper;
import com.atguigu.Mybatis.Mapper.UserMapper;
import org.hibernate.hql.internal.ast.tree.OrderByClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    ApplyInfoMapper applyInfoMapper;
    //查询一个对象
    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") Integer id){
        return ordersMapper.getOrderById(id);
    }
    //查询单个对象
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        System.out.println(userMapper.getUser(id));
        return userMapper.getUser(id);
    }
    //查询列表
    @GetMapping("/userList")
    public List<User> getListUser(){
        return userMapper.getListUser();
    }

    //查询列表，项目测试
//    测试
//    @RequestMapping(value = "/getApplyCodeByPaymentPlayCode")
//        public List<String> getApplyCodeByPaymentPlayCode(){
//            List<String> paymentPlanCodes = new ArrayList<>();
//            paymentPlanCodes.add("BJXQFK201512070051");
//            paymentPlanCodes.add("BJKDFK201701050118");
//            paymentPlanCodes.add("BJXQFK201708300033");
//            List<Integer> applyStatusList = new ArrayList<>();
//            applyStatusList.add(1);
//            return applyInfoMapper.getApplyCodeByPaymentPlayCode(paymentPlanCodes, applyStatusList);
//    }

//    @RequestMapping(value = "/getApplyCodeByPaymentPlayCode")
//    public List<String> getApplyCodeByPaymentPlayCode(@RequestParam(value = "paymentPlanCodes",required = false) List<String> paymentPlanCodes){
//        List<Integer> applyStatusList = new ArrayList<>();
//            applyStatusList.add(1);
//        return applyInfoMapper.getApplyCodeByPaymentPlayCode(paymentPlanCodes, applyStatusList);
//    }

    @RequestMapping(value = "/getApplyCodeByPaymentPlayCode")
    public List<String> getApplyCodeByPaymentPlayCode(@RequestParam(value = "paymentPlanCodes",required = false) List<String> paymentPlanCodes,
                                                      @RequestParam(value = "applyStatusList",required = false) List<Integer> applyStatusList){
            return applyInfoMapper.getApplyCodeByPaymentPlayCode(paymentPlanCodes, applyStatusList);
    }

    //插入
    @GetMapping("/user")
//    @Transactional      //配置事务，添加@Transactional
    public void insertUser(User user){
        userMapper.insertUser(user);
        System.out.println(user);
//        if(true){
//            throw new RuntimeException("抛出异常");
//        }
    }
}
