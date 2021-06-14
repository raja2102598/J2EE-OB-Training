package com.onebill.spring.SpringAnnotationAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.MessageBean;
import com.onebill.spring.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean bean = context.getBean(MessageBean.class);
		System.out.println("In main :"+bean.getMessage());
		bean.setMessage("Helloooo");
		System.out.println("Update Msg in Main : "+bean.getMessage());

	}

}
