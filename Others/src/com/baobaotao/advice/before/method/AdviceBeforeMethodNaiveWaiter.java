package com.baobaotao.advice.before.method;

import org.apache.log4j.Logger;

public class AdviceBeforeMethodNaiveWaiter implements AdviceBeforeMethodWaiter {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void greetTo(String name) {
		// TODO Auto-generated method stub
		this.logger.info("Greet to customer..."+name);
	}

	public void serveTo(String name) {
		// TODO Auto-generated method stub
		this.logger.info("Serve to customer..."+name);
	}

}
