package com.onebill.spring.SpringCoreAssignments;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.SpringCoreAssignments.bean.Bike;

public class BikeBeanFac {

	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("bikeConf.xml");
		Bike bean = (Bike) beanFactory.getBean("bike");
		bean.drive();
	}

}
