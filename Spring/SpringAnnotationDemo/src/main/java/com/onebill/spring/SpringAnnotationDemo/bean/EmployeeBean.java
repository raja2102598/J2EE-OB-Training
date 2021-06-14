package com.onebill.spring.SpringAnnotationDemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class EmployeeBean {
	private String name;
	private int age;

	@Autowired
//	@Qualifier("ac")
	private DepartmentBean department;
	public EmployeeBean() {
		super();
	}
	
}
