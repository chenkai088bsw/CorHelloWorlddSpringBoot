package com.atguigu.transaction;

import org.apache.ibatis.type.Alias;

@Alias("user")  //别名
public class User {
    private Long id;
    private String userName;
    private String note;
}
