package com.onebill.spring.SpringAnnotationDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.onebill.spring.SpringAnnotationDemo.bean.EmployeeBean;

@Configuration
public class EmployeeConfig1 {

	@Bean
	@Scope("prototype")
	public EmployeeBean getEmpDetails() {
//		EmployeeBean bean=new EmployeeBean();
//		bean.setAge(10);
//		bean.setName("Raja");
//		return bean;
		return new EmployeeBean();
	}
}
