package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Message;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("messageConfig.xml");
		Message bean = (Message) context.getBean("message");
		System.out.println(bean.getMessage());
		((AbstractApplicationContext)context).close();
	}

}
