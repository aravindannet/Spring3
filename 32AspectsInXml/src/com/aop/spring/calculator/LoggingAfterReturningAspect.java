package com.aop.spring.calculator;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

@Aspect
public class LoggingAfterReturningAspect {
	private Log log = LogFactory.getLog(this.getClass());
	
	
	@AfterReturning("execution(* *.*(..))")	
	public void logAfterReturning(JoinPoint joinPoint){
		log.info("The method "+joinPoint.getSignature().getName()+"()  ends successfully ");
	}
	
	
}