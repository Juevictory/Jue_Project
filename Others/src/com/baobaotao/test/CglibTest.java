package com.baobaotao.test;

import com.baobaotao.proxy.handler.CglibProxy;
import com.baobatao.service.implement.ForumServiceImpl;

public class CglibTest {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		ForumServiceImpl fImpl=(ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
		fImpl.removeForum(1012);
		fImpl.removeTopic(10);
	}
}
