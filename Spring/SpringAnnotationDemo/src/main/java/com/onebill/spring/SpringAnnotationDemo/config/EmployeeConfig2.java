package com.onebill.spring.SpringAnnotationDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.SpringAnnotationDemo.bean.EmployeeBean;

@Configuration
public class EmployeeConfig2 {

	@Bean
	public EmployeeBean getEmployeeDetails() {
		EmployeeBean bean=new EmployeeBean();
		bean.setName("Raja");
		bean.setAge(21);
		return bean;
	}
}
