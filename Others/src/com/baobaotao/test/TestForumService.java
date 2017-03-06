package com.baobaotao.test;

import java.lang.reflect.Proxy;

import com.baobaotao.concept.IForumService;
import com.baobaotao.proxy.handler.PerformanceHandler;
import com.baobatao.service.implement.ForumServiceImpl;

public class TestForumService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IForumService forumService = new ForumServiceImpl();
		// forumService.removeForum(10);
		// forumService.removeTopic(1021);
		IForumService target = new ForumServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(target);
		IForumService proxy = (IForumService) Proxy.newProxyInstance(target.getClass()
				.getClassLoader(), target.getClass().getInterfaces(), handler);
		proxy.removeForum(10);
		proxy.removeTopic(1021);

	}
}
