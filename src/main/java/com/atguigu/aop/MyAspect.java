package com.atguigu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class MyAspect {
    @Pointcut("execution(* com.atguigu.aop.UserServiceImpl.printUser(..))")
    public void pointCut(){
    }
    @Before("pointCut()")       //这里注意这里写的是方法名
    public void before(){
        System.out.println("before.......");
    }
    @After("pointCut()")
    public void after(){
        System.out.println("after.......");
    }
    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning.....");
    }
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("around before.....");
        jp.proceed();   //回调目标对象原有方法
        System.out.println("around after.....");
    }
}
