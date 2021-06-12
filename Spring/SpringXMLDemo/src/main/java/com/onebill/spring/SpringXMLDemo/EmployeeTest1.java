package com.onebill.spring.SpringXMLDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Employee;

public class EmployeeTest1 {

	public static void main(String[] args) {
		
		ApplicationContext obj1=new ClassPathXmlApplicationContext("allConfigs.xml");
		Employee bean1 = (Employee) obj1.getBean("employee",Employee.class);
		System.out.println(bean1.getName());
		System.out.println(bean1.getAge());
		System.out.println(bean1.getDepartment().getDeptId());
		System.out.println(bean1.getDepartment().getDeptName());
	}

}
