package demo5_AOP_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {


    @Pointcut(value = "execution(* demo5_AOP_annotation.User.add(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void before(){
        System.out.println("PersonProxy Before ...");

    }
}
