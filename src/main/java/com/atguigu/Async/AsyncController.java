package com.atguigu.Async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    private AsyncService asyncService = null; //注入异步服务接口
    @RequestMapping("/page")
    public String asyncPage(){
        System.out.println("请求线程名称:"
        + Thread.currentThread().getName());
        asyncService.generateReport();  //调用异步服务
        return "async";
    }
}
