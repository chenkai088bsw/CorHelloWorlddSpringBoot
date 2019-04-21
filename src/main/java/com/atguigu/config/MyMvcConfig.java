package com.atguigu.config;

import com.atguigu.LoginHandlerIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurerAdapter可以来扩展SpringMvc的功能
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("login");
//    }

    //所有的WebMvcConfigurerAdpater组件都会一起作用
    @Bean//将组件注册在容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            public void addViewControllers(ViewControllerRegistry registry){
                //registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard"); //增加一个视图映射
            }

            //注册拦截器y
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                //super.addInterceptors(registry);                     //addPathPatterns添加拦截哪些请求
//                registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
//                        .excludePathPatterns("/login.html","/","/user/login");
//            }
        };
        return adapter;
    }
}
