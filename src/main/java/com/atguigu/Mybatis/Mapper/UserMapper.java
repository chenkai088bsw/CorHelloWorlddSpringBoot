package com.atguigu.Mybatis.Mapper;

import com.atguigu.Mybatis.Bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//注解版本
//指定这是一个操作数据库的mapper
@Mapper
public interface UserMapper {
    //查询
    @Select("select * from user where id=#{id}")
    public User getUser(Integer id);
    @Select("select * from user")
    public List<User> getListUser();
    //删除
    @Delete("delete from user where id=#{id}")
    public int delelteUserById(Integer id);
    //插入
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    public void insertUser(User user);
    //跟新
    @Update("update user set username=#{username} where id=#{id}")
    public int updateUser(User user);
}













