package com.atguigu.Async;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
//开启Spring异步
public class AsyncConfig implements AsyncConfigurer {
    @Override//定义线程池
    public Executor getAsyncExecutor(){
        //定义线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //设置核心线程数
        taskExecutor.setCorePoolSize(10);
        //线程池最大线程数目
        taskExecutor.setMaxPoolSize(30);
        //线程队列最大线程数
        taskExecutor.setQueueCapacity(2000);
        //初始化
        taskExecutor.initialize();
        return taskExecutor;
    }
}










