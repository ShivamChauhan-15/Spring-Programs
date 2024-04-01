package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Component
//@EnableAspectJAutoProxy
@Aspect
public class AspectAop {

    @Before("within(org.example..*)")
//    @Before("execution(* org.example.PaymentImplementClass.makePayment(..))") //pointcut is within parenthesis
   // we use (..)for parameter or  we can use * in place of method name if we want to execute this before every method
    //this method is advice
    public void beforePayment(){
        System.out.println("Tansaction started...");
    }
//    @Around is an advice type that wraps around a join point.
//     @Around advice type is used to intercept method invocations or join points and execute custom behavior around them
//    It has the ability to proceed to the join point, skip the execution of the join point,
//     or modify the arguments passed to the join point.
//     It can also control the flow of execution by deciding whether to proceed with the execution of the join point or not.
    @Around("execution(* org.example.PaymentImplementClass.makePayment(..))")
    public void aroundCustom(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Tansaction going on...");
        joinPoint.proceed();
    }

    @After("myPointCuts()")
    public void afterPayment(){
        System.out.println("Tansaction completed...");
    }
    @Pointcut("within(org.example..*)")
    public void myPointCuts(){}


}
