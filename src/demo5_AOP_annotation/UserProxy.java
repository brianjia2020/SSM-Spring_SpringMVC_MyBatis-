package demo5_AOP_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

//enhanced class
@Component
@Aspect
@Order(3)
public class UserProxy {

    @Pointcut(value = "execution(* demo5_AOP_annotation.User.add(..))")
    public void pointcut(){

    }

    //method to be performed before
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("UserProxy before...");
    }

    @AfterReturning(value="pointcut()")
    public void AfterReturning(){
        System.out.println("UserProxy AfterReturning...");
    }

    @After(value="pointcut()")
    public void after(){
        System.out.println("UserProxy After...");
    }


    //only an exception
    @AfterThrowing(value="pointcut()")
    public void AfterThrowing(){
        System.out.println("UserProxy AfterThrowing...");
    }



    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before around...");

        proceedingJoinPoint.proceed();

        System.out.println("After around...");
    }
}
