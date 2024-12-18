package com.ex.LifeLine;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoginAspect {
	@Before("execution(* com.ex.LifeLine.LifelineController.*(..))")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Before executing method: " + joinPoint.getSignature().getName());
    }

    // Log after any method in LifelineController is executed
    @After("execution(* com.ex.LifeLine.LifelineController.*(..))")
    public void logAfterMethodExecution(JoinPoint joinPoint) {
        System.out.println("After executing method: " + joinPoint.getSignature().getName());
    }
}