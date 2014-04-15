package com.aop.spring.calculator;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.aop.MethodBeforeAdvice;

@Aspect
public class LoggingBeforeAspect {
	
private Log log = LogFactory.getLog(this.getClass());

@Before("execution(* *.add(..))")
public void logBefore(){
	log.info("the method begins");
}
@Before("execution(* *.sub(..))")
public void logBeforeWithJoinpointInfo(JoinPoint joinPoint){
	log.info("the method  "+joinPoint.getSignature().getName()+" begins with "
			+Arrays.toString(joinPoint.getArgs()) );
}

}
