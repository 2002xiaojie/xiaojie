package edu.soft1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAop {//切面类能否有多个切点?
/*    @Pointcut("execution(* edu.soft1.service.UserService.add())")//切点
    public void pointy(){}



    @Before(value = "pointy()")//增强（advice）
    //@Before("pointy()")
    public void beforeAdd(){System.out.println("UserServiceAop前置增强操作---权限验证");}
    @After(value ="edu.soft1.aop.HelloAspect.pointx()")//增强（advice）
    //@After("pointy()")
    public void afterAdd(){System.out.println("UserServiceAop后置增强操作---写入日志");}
    @Around(value ="pointy()")//环绕增强（advice）
//@Around("pointy()")
    public Object aroundAdd(ProceedingJoinPoint pjp) throws  Throwable{
        System.out.println("UserServiceAop环绕前置增强");
        Object result = pjp.proceed();//执行
        System.out.println("UserServiceAop环绕后置增强");
        return result;
    }
@AfterReturning(value = "pointy()", returning = "result")//执行成功后执行
    public void afterReAdd(JoinPoint jp,Object result){
        System.out.println("正常执行"+jp.getTarget()+","+jp.getSignature().getName()+"方法,返回值是："+result);

    }
    @AfterThrowing(value = "pointy()")//抛出异常时执行
     public void afterThrAdd(JoinPoint jp){
        System.out.println("异常执行"+jp.getTarget()+","+jp.getSignature().getName()+"方法时，出现异常");

    }
    @Pointcut("execution(* edu.soft1.service.UserService.delete())")
    public void pointy2(){}
    @Before(value = "pointy2()")
    public void beforeDelete(){
        System.out.println("");
    }*/
/*    @Pointcut(value = "execution(* edu.soft1.service.UserService.add(..))")
    public void point1(){}
@Before(value = "point1()")
    public void beforeAdd(){
    System.out.println("add()前置增强");
}*/
    @Around(value = "execution(* edu.soft1.service.UserService.add())")
    public Object beforeAdd (ProceedingJoinPoint PJP) throws Throwable{
        System.out.println("add()前置增强");
        Object result = PJP.proceed();
        System.out.println("add()前置增强");
        return  result;
    }
    @Around(value = "execution(* edu.soft1.service.UserService.delete(..))")
    public Object beforeDelete (ProceedingJoinPoint PJP) throws Throwable {
        System.out.println("add()前置增强");
        Object result = PJP.proceed();
        System.out.println("add()前置增强");
        return result;

        }
    @Around(value = "execution(* edu.soft1.service.UserService.query(..))")
    public Object beforeQuery (ProceedingJoinPoint PJP) throws Throwable {
        System.out.println("add()前置增强");
        Object result = PJP.proceed();
        System.out.println("add()前置增强");
        return result;
    }
    @Around(value = "execution(* edu.soft1.service.UserService.update(..))")
    public Object beforeUpdate (ProceedingJoinPoint PJP) throws Throwable {
        System.out.println("add()前置增强");
        Object result = PJP.proceed();
        System.out.println("add()前置增强");
        return result;
    }
    }

