package com.atguigu.aop;

import org.hibernate.boot.jaxb.SourceType;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if(user==null){
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.println("id = "+user.getId());
        System.out.println("username = "+user.getUsername());
        System.out.println("note = "+user.getNote());
    }
}
