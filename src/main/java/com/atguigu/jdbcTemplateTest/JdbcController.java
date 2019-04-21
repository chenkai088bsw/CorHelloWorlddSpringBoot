package com.atguigu.jdbcTemplateTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JdbcController {
    @Autowired
    private JdbcTemplateServiceImpl userService;
    @RequestMapping("/saveUser")
    @ResponseBody
    public String save(){
        userService.testCount();
        userService.getUser(10);
        return "Success";
    }

}
