package com.baobaotao.common;

import org.apache.log4j.Logger;

public class MethodPerformance {

	private long begin;
	
	private long end;
	
	private String serviceMethod;
	
	private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
	
	public MethodPerformance(String serviceMethod){
		this.serviceMethod=serviceMethod;
		this.begin=System.currentTimeMillis();
	}
	
	public void printPerformance(){
		end = System.currentTimeMillis();
		long elapse = this.end-this.begin;
		this.logger.info(serviceMethod+" ª®∑— " + elapse +"∫¡√Î"); 
	}
}
