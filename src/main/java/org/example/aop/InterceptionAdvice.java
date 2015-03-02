package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class InterceptionAdvice
{
  @Before("execution(* org.example.data.*Repository+.findByName(..))")
  public void intercept(JoinPoint joinPoint)
  {
    LoggerFactory.getLogger(getClass()).warn(String.format("The method %s::%s was intercepted."
        , joinPoint.getSignature().getDeclaringTypeName()
        , joinPoint.getSignature().getName()));
  }
}
