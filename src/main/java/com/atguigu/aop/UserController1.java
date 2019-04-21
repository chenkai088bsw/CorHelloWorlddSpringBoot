package com.atguigu.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user1")
public class UserController1 {
    @Autowired
    private UserService userService = null;
    @RequestMapping("/print1")
    @ResponseBody   //将后面的user对象输出
    public User printUser(int id,String username,String note){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setNote(note);
        userService.printUser(user);
        return user;
    }
}
