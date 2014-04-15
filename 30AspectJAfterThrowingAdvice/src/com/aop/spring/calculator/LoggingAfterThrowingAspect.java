package com.aop.spring.calculator;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

@Aspect
public class LoggingAfterThrowingAspect {
	private Log log = LogFactory.getLog(this.getClass());
	
	
	@AfterThrowing("execution(* *.*(..))")	
	public void logAfterThrowing(JoinPoint joinPoint){
		log.info("An exception has occured in "+joinPoint.getSignature().getName());
	}
	
	
}