package com.atguigu.SpringData.controller;

import com.atguigu.SpringData.entity.User;
import com.atguigu.SpringData.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class UserJpaController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/userjpa/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).get();
        return user;
    }
    @GetMapping("/userjpa")
    public User insertUser(User user){
        User save = userRepository.save(user);
        //int i= 2/0;
        return save;
    }
}
