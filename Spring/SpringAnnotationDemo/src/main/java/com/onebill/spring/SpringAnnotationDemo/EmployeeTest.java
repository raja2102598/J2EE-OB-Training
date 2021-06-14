package com.onebill.spring.SpringAnnotationDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.SpringAnnotationDemo.bean.EmployeeBean;
import com.onebill.spring.SpringAnnotationDemo.config.EmployeeConfig1;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig1.class);
		EmployeeBean bean1 = applicationContext.getBean(EmployeeBean.class);
		EmployeeBean bean2 = applicationContext.getBean(EmployeeBean.class);
//		System.out.println(bean);
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter The Name : ");
		bean1.setName(scan.next());
		System.out.print("Enter The Age : ");
		bean1.setAge(scan.nextInt());
		System.out.print("Enter The Name : ");
		bean2.setName(scan.next());
		System.out.print("Enter The Age : ");
		bean2.setAge(scan.nextInt());
		System.out.println("Name "+bean1.getName());
		System.out.println("Age "+bean1.getAge());
		System.out.println("-----------------------------");

		System.out.println("Name "+bean2.getName());
		System.out.println("Age "+bean2.getAge());
	}

}
