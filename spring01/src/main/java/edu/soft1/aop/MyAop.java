package edu.soft1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyAop {
    @Pointcut("execution(public * edu.soft1.service.impl.UserServiceImpl.*.*(..))")
    public void myPointcut(){

    }
    @Before("myPointcut()")
    public void before(){
        System.out.println("前置~");
    }
    @After("myPointcut()")
    public void after(){
        System.out.println("后置~");
    }
    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint jp){
        Object obj = null;
        Object[] args = jp.getArgs();
        try {
            obj = jp.proceed();//执行
        }catch (Throwable e){
            e.printStackTrace();
        }
        return obj;
    }
}
