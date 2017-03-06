package com.baobaotao.concept;

import com.baobaotao.common.Forum;
import com.baobaotao.common.PerformanceMonitor;
import com.baobaotao.common.TransactionManager;
import com.baobaotao.dao.ForumDao;
import com.baobaotao.dao.TopicDao;

public class ForumService {

	private TransactionManager transManager;
	private PerformanceMonitor pmonitor;
	private TopicDao topicDao;
	private ForumDao forumDao;

	public void removeTopic(int topicId) {
		this.pmonitor.start();
		this.transManager.beginTransaction();
		this.topicDao.removeTopic(topicId);
		this.transManager.commit();
		this.pmonitor.end();
	}

	public void createForum(Forum forum) {
		this.pmonitor.start();
		this.transManager.beginTransaction();
		this.forumDao.create(forum);
		this.transManager.commit();
		this.pmonitor.end();
	}
}
