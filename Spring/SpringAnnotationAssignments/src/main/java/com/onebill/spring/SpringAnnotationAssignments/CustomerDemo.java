package com.onebill.spring.SpringAnnotationAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.Customer;
import com.onebill.spring.config.CustomerConfig;

public class CustomerDemo {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer bean = context.getBean(Customer.class);
		System.out.println(bean.getName());
	}
}
