package com.htsa.design.dymanic.poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldHandler implements InvocationHandler {

	private Object obj;

	public HelloWorldHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		this.doBefore();
		result = method.invoke(this.obj, args);
		this.doAfter();
		return result;
	}

	public void doBefore() {
		System.out.println(obj.getClass().getSimpleName()
				+ " will say hello... ");
	}

	public void doAfter() {
		System.out.println(obj.getClass().getSimpleName()
				+ " said hello already...");
	}

}
