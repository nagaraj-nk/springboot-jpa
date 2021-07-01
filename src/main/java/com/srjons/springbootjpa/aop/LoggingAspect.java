package com.srjons.springbootjpa.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

    @Around("execution(* com.srjons.springbootjpa..*(..)))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        final StopWatch stopWatch = new StopWatch();

        //Measure method execution time
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " "
                + ":: " + stopWatch.getTotalTimeMillis() + " ms");

        System.out.println(result.toString());

        return result;
    }

    @After("execution(* com.srjons.springbootjpa..*(..)))")
    public void profileAllMethodsAfterDone(JoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " "
                + ": Completed");
    }

    @AfterReturning("execution(* com.srjons.springbootjpa..*(..)))")
    public void profileAllMethodsAfterRunning(JoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " "
                + ": Completed Normal");
    }

    @Before("execution(* com.srjons.springbootjpa..*(..)))")
    public void profileAllMethodsBefore(JoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " "
                + ": Before Run");
    }
}