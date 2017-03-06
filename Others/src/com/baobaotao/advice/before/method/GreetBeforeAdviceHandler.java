package com.baobaotao.advice.before.method;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class GreetBeforeAdviceHandler implements MethodBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		String name = (String) arg1[0];
		this.logger.info("How are you..." + name);
	}

}
