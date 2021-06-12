package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("customerConfig.xml");
		Customer bean = context.getBean("customer",Customer.class);
		System.out.println(bean.getName());
	}

}
