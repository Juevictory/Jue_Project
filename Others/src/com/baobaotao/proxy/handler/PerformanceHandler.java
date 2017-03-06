package com.baobaotao.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.baobaotao.common.PerformanceMonitor;

public class PerformanceHandler implements InvocationHandler {

	private Object target;

	public PerformanceHandler(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		PerformanceMonitor.begin(this.target.getClass().getCanonicalName()
				+ "." + method.getName());
		Object obj = method.invoke(target, arg2);
		PerformanceMonitor.end();
		return obj;
	}

}
