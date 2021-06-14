package com.onebill.spring.SpringAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.SpringAnnotationDemo.bean.EmployeeBean;
import com.onebill.spring.SpringAnnotationDemo.config.AllConfigs;

public class EmployeeDeptDemo1 {

	public static void main(String[] args) {
		ApplicationContext aplApplicationContext=new AnnotationConfigApplicationContext(AllConfigs.class);
		EmployeeBean bean=aplApplicationContext.getBean(EmployeeBean.class);
		
		System.out.println("Employee Name :"+ bean.getName());
		System.out.println("Employee Age :"+ bean.getAge());
		System.out.println("Department id :"+bean.getDepartment().getDeptId());
		System.out.println("Department name :"+bean.getDepartment().getDeptName());
	}

}
