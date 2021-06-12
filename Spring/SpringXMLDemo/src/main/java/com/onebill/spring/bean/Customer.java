package com.onebill.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	private String name;

	public Customer() {
		
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Inside setApplicationContext ");
		System.out.println(applicationContext.containsBean("custome"));
		this.name="Ajay";
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Inside setBeanFactory");
//		System.out.println(beanFactory.isSingleton("customr")); //Creates Exception if wrong
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Inside setBeanName");
		
	}
	
}
