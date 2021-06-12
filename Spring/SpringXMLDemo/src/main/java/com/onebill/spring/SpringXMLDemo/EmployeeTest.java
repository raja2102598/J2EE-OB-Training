package com.onebill.spring.SpringXMLDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext obj1=new ClassPathXmlApplicationContext("employeeconfig.xml");
		Employee bean1 = (Employee) obj1.getBean("employee");
		Employee bean2= (Employee) obj1.getBean("employee");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter emp name :");
		bean1.setName(scan.nextLine());
		System.out.println("enter emp age :");
		bean1.setAge(scan.nextLine());
		System.out.println("enter emp name :");
		bean2.setName(scan.nextLine());
		System.out.println("enter emp age :");
		bean2.setAge(scan.nextLine());
		
		System.out.println("Name : "+bean1.getName());
		System.out.println("Age : "+bean1.getAge());
		System.out.println("Name : "+bean2.getName());
		System.out.println("Age : "+bean1.getAge());
	}

}
