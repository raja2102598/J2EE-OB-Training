package com.onebill.spring.SpringCoreAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.SpringCoreAssignments.bean.Car;

public class VechicleDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("allConf.xml");
		Car bean = (Car) applicationContext.getBean("car");
		System.out.println("Car Name : " +bean.getCarName());
		System.out.println("Engine Name : "+bean.getEngine().getEngineName());
	}

}
