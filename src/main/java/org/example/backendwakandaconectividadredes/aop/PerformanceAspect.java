package org.example.backendwakandaconectividadredes.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* org.example.backendwakandaconectividadredes.service.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        logger.info(joinPoint.getSignature() + " ejecutado en " + executionTime + " ms");

        return proceed;
    }
}
