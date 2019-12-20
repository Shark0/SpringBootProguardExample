package com.shark.example.configuration.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component("TimeLogAspect")
public class TimeLogAspect {

    @Pointcut("@annotation(TimeLog))")
    public void timeLog(){
    }

    @Around("timeLog()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Logger logger = LoggerFactory.getLogger(pjp.getSignature().getDeclaringType());
        try {
            long start = System.currentTimeMillis();
            Object o =  pjp.proceed();
            long executeTime = System.currentTimeMillis() - start;
            String methodName = pjp.getSignature().getName();
            Object[] input = pjp.getArgs();
            String output = o == null ? "" : o.toString();
            logger.trace(methodName + "\t" + executeTime + "\t" + Arrays.toString(input) + "\t" + output);
            return o;
        } catch (Throwable e) {
            logger.error(Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }
}
