package com.test.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Pointcut("execution(public * com.test.service..*.*(..))")
    public void mythod() {
    }

    @Before("mythod()")
    public void before(){
        System.out.println("日志开始");
    }
    @After("mythod()")
    public void after(){
        System.out.println("日志结束");
    }

}
