package com.baobaotao.common;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;

public class TransactionManager extends DataSourceTransactionManager{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7728210064461769405L;

	/**
	 * 
	 */
	public void beginTransaction(){
		super.doGetTransaction();
	}
	
	/**
	 * 
	 */
	public void commit(){
		super.commit(null);
	}
}
