package com.onebill.spring.SpringAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung obj = applicationContext.getBean(Samsung.class);
		obj.config();
		((AbstractApplicationContext)applicationContext).close();
	}
}
