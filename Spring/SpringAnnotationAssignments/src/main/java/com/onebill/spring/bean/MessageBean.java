package com.onebill.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageBean implements InitializingBean,DisposableBean {
	private String message;
	public MessageBean() {
		super();
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		message="From afterPropertiesSet";
		System.out.println("afterPropertiesSet : "+message);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}
}
