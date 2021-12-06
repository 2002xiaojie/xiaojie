package edu.soft1.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//切面类
/*@Aspect    //切面类的注解
@Component    //bean对象装配到IoC容器中的注解*/
public class HelloAspect {
    @Pointcut("execution(* edu.soft1.utils..*.*(..))")
    public void pointx(){}

    @Before("pointx()")//前置方法增强
    public void beforeHello(){System.out.println("前置~");}

    @After("pointx()")//后置方法增强
    public void afterHello(){
        System.out.println("后置~");
    }

}
