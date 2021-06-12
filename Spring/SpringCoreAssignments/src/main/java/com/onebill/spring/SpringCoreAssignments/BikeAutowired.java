package com.onebill.spring.SpringCoreAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.SpringCoreAssignments.bean.Bike;

public class BikeAutowired {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bikeConf.xml");
		Bike bean = (Bike) applicationContext.getBean("bike");
		System.out.println(bean.getBikeName());
		bean.drive();
	}

}
