package com.atguigu;

import com.atguigu.aop.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @SpringBootApplication来标注主程序，说明这个一个SpringBoot应用
 */
@SpringBootApplication
@EnableScheduling   //加入@EnableScheduling注解，开启定时任务的配置
@EnableJpaRepositories(basePackages={"com.atguigu.SpringData"})
public class HelloWorldMainApplication {
    @Bean(name="myAspect")      //在Aspect中如果没有使用value=，那么bean名称默认是类名第一个字母小写
    public MyAspect initMyAspect(){
        return new MyAspect();
    }
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
