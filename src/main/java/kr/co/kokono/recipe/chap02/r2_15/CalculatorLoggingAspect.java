package kr.co.kokono.recipe.chap02.r2_15;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class CalculatorLoggingAspect {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* ArithmeticCalculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {

        log.info("Join point kind : {}", joinPoint.getKind());
        log.info("Signature declaring type : {}",
                joinPoint.getSignature().getDeclaringTypeName());
        log.info("Signature name: {}", joinPoint.getSignature().getName());
        log.info("Arguments : {}", Arrays.toString(joinPoint.getArgs()));
        log.info("Target class : {}", joinPoint.getTarget().getClass().getName());
        log.info("This class: {}", joinPoint.getThis().getClass().getName());
    }



}
