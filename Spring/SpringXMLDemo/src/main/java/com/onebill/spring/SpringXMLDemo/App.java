package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *BEANFactoryPostProcessor
 *BeanPostProcessor
 *InitializingBean
 *DisposableBean
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//      Vehicle vehicle= (Car) context.getBean("car");
//      vehicle.drive();
		
		Car bean = (Car) context.getBean("car");
		bean.drive();
	}
}
