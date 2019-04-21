package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller     //标注了后可以处理请求
public class HelloControl {

//    @RequestMapping({"/","/login.html"})    //访问/或者/login.html都访问主页
//    public String index(){
//        return "login";   //如果我们写一个返回值，这个返回值会默认得到themleaf模板引擎的解析
//    }

    @ResponseBody               //将helloWorld写出去要结合这个注解
    @RequestMapping("/hello")       //接收来自于浏览器的hello请求
    public String hello(){
        return "hello world";       //给浏览器返回helloworld
    }

    //查出一些数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好<h1>");
        map.put("user", Arrays.asList("zhangsan","lisi","wangwu"));
        //classpath:/templates/success.html
        return "success";
    }


}









