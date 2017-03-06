package com.baobaotao.advice.before.method;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestAdviceBeforeMethod {

	@Test
	public void test(){
		AdviceBeforeMethodWaiter target = new AdviceBeforeMethodNaiveWaiter();
		BeforeAdvice advice = new GreetBeforeAdviceHandler();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(advice);
		proxyFactory.setTarget(target);
		AdviceBeforeMethodWaiter advisor = (AdviceBeforeMethodWaiter)proxyFactory.getProxy();
		advisor.greetTo("Fucker");
	}
}
