package com.onebill.spring.SpringAnnotationAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.config.AnimalConfig;

public class AnimalDemo {

	public static void main(String[] args) {
		System.out.println("Before Conf");
		ApplicationContext context=new AnnotationConfigApplicationContext(AnimalConfig.class);
		System.out.println("After Conf");
		Animal bean = context.getBean(Animal.class);
		bean.eat();
		bean.speak();
		((AbstractApplicationContext)context).close();
	}

}
