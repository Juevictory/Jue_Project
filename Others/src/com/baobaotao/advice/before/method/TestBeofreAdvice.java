package com.baobaotao.advice.before.method;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeofreAdvice {

	@Test
	public void testBfAd() {
		AdviceBeforeMethodWaiter waiter = new AdviceBeforeMethodNaiveWaiter();
		BeforeAdvice beforeAdvice = new GreetBeforeAdviceHandler();
		ProxyFactory proxy = new ProxyFactory();
		proxy.setTarget(waiter);
		proxy.addAdvice(beforeAdvice);
		AdviceBeforeMethodWaiter newWaiter = (AdviceBeforeMethodWaiter) proxy
				.getProxy();
		newWaiter.greetTo("Jue");
	}
}
