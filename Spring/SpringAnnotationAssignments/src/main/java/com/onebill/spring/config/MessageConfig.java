package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.SpringAnnotationAssignments.MyBeanFactoryPP;
import com.onebill.spring.SpringAnnotationAssignments.MyBeanPP;
import com.onebill.spring.bean.MessageBean;

@Configuration
public class MessageConfig {
	@Bean
	public static MessageBean getMsgBean() {
		return new MessageBean();
	}

	@Bean
	public static MyBeanPP getBeanPP() {
		return new MyBeanPP();
	}

	@Bean
	public static MyBeanFactoryPP getBeanFactoryPP() {
		return new MyBeanFactoryPP();
	}
}
