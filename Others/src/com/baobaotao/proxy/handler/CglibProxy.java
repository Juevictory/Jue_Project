package com.baobaotao.proxy.handler;

import java.lang.reflect.Method;

import com.baobaotao.common.PerformanceMonitor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		PerformanceMonitor.begin(arg0.getClass().getName() + "."
				+ arg1.getName());
		//ͨ�� ��Ŀ�����з������������λ��ǿ��������ͬ��εķ������ᱻ��ǿ
		Object obj = arg3.invokeSuper(arg0, arg2);
		PerformanceMonitor.end();
		return null;
	}

}
