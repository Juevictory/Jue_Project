package com.htsa.design.dymanic.poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class HelloWorldTest {

	public static void main(String[] args) {
		HelloWorld china = new CountryChina();
		HelloWorld america = new CountryAmerica();
		InvocationHandler handler1 = new HelloWorldHandler(china);
		InvocationHandler handler2 = new HelloWorldHandler(america);
		HelloWorld ch = (HelloWorld) Proxy.newProxyInstance(china.getClass().getClassLoader(),
				china.getClass().getInterfaces(), handler1);
		HelloWorld am = (HelloWorld) Proxy.newProxyInstance(america.getClass().getClassLoader(),
				america.getClass().getInterfaces(), handler2);
		ch.sayHello();
		am.sayHello();
	}
}
