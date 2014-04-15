package com.aop.spring.calculator;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;


public class LoggingAfterAspect {
	private Log log = LogFactory.getLog(this.getClass());
	
	
	public void logAfter(){		
		log.info("in Logafter......");
	}
	
	
}