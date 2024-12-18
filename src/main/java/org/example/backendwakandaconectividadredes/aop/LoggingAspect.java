package org.example.backendwakandaconectividadredes.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* org.example.backendwakandaconectividadredes.service.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Método llamado: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* org.example.backendwakandaconectividadredes.service.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("Método completado: " + joinPoint.getSignature().getName() + " | Resultado: " + result);
    }

    @AfterThrowing(pointcut = "execution(* org.example.backendwakandaconectividadredes.service.*(..))", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        logger.error("Excepción lanzada en el método: " + joinPoint.getSignature().getName(), exception);
    }
}
