package com.baobatao.service.implement;

import org.apache.log4j.Logger;

import com.baobaotao.common.PerformanceMonitor;
import com.baobaotao.concept.IForumService;

public class ForumServiceImpl implements IForumService {

	private Logger logger = Logger
			.getLogger(this.getClass().getCanonicalName());

	@SuppressWarnings("static-access")
	public void removeForum(int forumId) {
		// TODO Auto-generated method stub
		//PerformanceMonitor.begin("com.baobaotao.ForumServiceImpl.removeForum");
		this.logger.info("ģ��ɾ��forum��¼ ---" + forumId);
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//PerformanceMonitor.end();
	}

	@SuppressWarnings("static-access")
	public void removeTopic(int topciId) {
		// TODO Auto-generated method stub
		//PerformanceMonitor.begin("com.baobaotao.ForumServiceImpl.removeForum");
		this.logger.info("ģ��ɾ��topic��¼ ---" + topciId);
		try {
			Thread.currentThread().sleep(40);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//PerformanceMonitor.end();
	}

}
