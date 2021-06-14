package com.onebill.spring.SpringAnnotationAssignments;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.onebill.spring.bean.MessageBean;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("postProcessBeanFactory ");
		MessageBean bean = beanFactory.getBean(MessageBean.class);
		bean.setMessage("From postProcessBeanFactory");
		System.out.println("postProcessBeanFactory : "+bean.getMessage());
	}

}
