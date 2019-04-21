package com.atguigu.SpringData.repository;

import com.atguigu.SpringData.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaRepository类完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer>{
    //第一个参数：我们要操作哪个实体类
    //第二个参数：实体类主键的类型
}
