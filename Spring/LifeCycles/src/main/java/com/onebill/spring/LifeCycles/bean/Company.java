package com.onebill.spring.LifeCycles.bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company implements BeanFactoryPostProcessor,BeanPostProcessor{
	
	private String name;
	public Company() {

	}
	
//	After loading xml definitions before instantiation and dependency injection
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory \nDefintion Count : " +beanFactory.getBeanDefinitionCount());
		System.out.println("Definition Names ");
		for(String name: beanFactory.getBeanDefinitionNames())
			System.out.println(name);
		Company bean = beanFactory.getBean(Company.class, "company");
		System.out.println("Name in Xml File :"+ bean.getName());
//		updating name
		bean.setName("Google");
	}
//	after instantiation and dependency injection
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization " +beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization " +beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
