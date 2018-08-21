package com.example.demo.aop;

import java.util.Arrays;

import org.slf4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
/**
 * @ClassName: AOPConfig
 * @Description: TODO
 * @author ZhengYH
 * @date 2018-08-21 14:59
 */
public class AOPConfig {
	
	Logger LOGGER = LoggerFactory.getLogger(AOPConfig.class);
	
	///带有Controller注解的方法在被调用时会执行Around注解的方法
	@Around("@within(org.springframework.stereotype.Controller) ")
	public Object simpleAop(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			//方法执行前
			LOGGER.debug("\nbefore : "
					+ "\n{"
					+ "\n \"class\" : \"" + pjp.getTarget().getClass().getName() + "\","
					+ "\n \"method\" : \"" + pjp.getSignature().getName() + "\""
					+ "\n \"args\" : \"" + Arrays.asList(pjp.getArgs()) + "\","
					+ "\n}");
			//调用原有的方法
			Object result = pjp.proceed();
			///方法执行后
			LOGGER.debug("\nafter : return:" + result);
			return result;
		}catch (Throwable e) {
			//不做处理，直接抛出给调用者
			throw e;
		}
	}
	///所有以set开头的且位于com.examole.demo.pojo包下的public方法在调用时都会执行该方法
	@Around("execution(public com.example.demo.pojo.* set*(..))") 
	public Object setMethodAop(final ProceedingJoinPoint pjp) throws Throwable {
		try {
			//方法执行前
			LOGGER.debug("\nbefore setter : "
					+ "\n{"
					+ "\n \"class\" : \"" + pjp.getTarget().getClass().getName() + "\","
					+ "\n \"method\" : \"" + pjp.getSignature().getName() + "\""
					+ "\n \"args\" : \"" + Arrays.asList(pjp.getArgs()) + "\","
					+ "\n}");
			//调用原有的方法
			Object result = pjp.proceed();
			///方法执行后
			LOGGER.debug("\nafter set : return:" + result);
			return result;
		}catch (Throwable e) {
			//不做处理，直接抛出给调用者
			throw e;
		}
	}
	
}
