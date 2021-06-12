package com.onebill.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Life Cycle Call Backs
//No lombok because of overriding methods
public class Message implements DisposableBean,InitializingBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	//Instantiation phase
	public Message() {
		System.out.println("Instantiation Phase");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() ");
	}
	
	public void  firstmethod() {
		System.out.println("Init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}
}
