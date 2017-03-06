package com.baobaotao.common;

import org.apache.log4j.Logger;

public class PerformanceMonitor {

	private static Logger log = Logger.getLogger(PerformanceMonitor.class);

	private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

	public static void start() {
		log.info("start monitor...");
	}

	public static void end() {
		log.info("end monitor...");
		MethodPerformance mp=performanceRecord.get();
		mp.printPerformance();
	}

	public static void begin(String method) {
		log.info(method);
		MethodPerformance mp = new MethodPerformance(method);
		performanceRecord.set(mp);
		log.info("start monitor...");
	}

	public static ThreadLocal<MethodPerformance> getPerformanceRecord() {
		return performanceRecord;
	}

	public static void setPerformanceRecord(ThreadLocal<MethodPerformance> performanceRecord) {
		PerformanceMonitor.performanceRecord = performanceRecord;
	}

}
