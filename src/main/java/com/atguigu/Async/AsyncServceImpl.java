package com.atguigu.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.stereotype.Service;

@Service
public class AsyncServceImpl implements AsyncService {
    @Override
    @Async  //声明使用异步调用
    public void generateReport() {
        System.out.println("报表线程名称: "
                + Thread.currentThread().getName());
    }
}
