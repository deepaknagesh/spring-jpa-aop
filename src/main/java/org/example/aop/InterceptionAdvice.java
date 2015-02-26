package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class InterceptionAdvice
{
  @Before("execution(* org.example.data.*Repository+.findByName(..))")
  public void intercept()
  {
    LoggerFactory.getLogger(getClass()).info("A method was intercepted.");
  }
}
