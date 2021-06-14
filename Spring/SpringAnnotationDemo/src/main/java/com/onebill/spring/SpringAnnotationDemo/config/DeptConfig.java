package com.onebill.spring.SpringAnnotationDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.SpringAnnotationDemo.bean.DepartmentBean;

@Configuration
public class DeptConfig {
	@Bean(name="department")
	public DepartmentBean getDepartment() {
		DepartmentBean departmentBean =new DepartmentBean();
		departmentBean.setDeptId(1);
		departmentBean.setDeptName("CS");
		return departmentBean;
		
	}

	@Bean(name="hr")
//	@Primary
	public DepartmentBean getHRDepartment() {
		DepartmentBean departmentBean =new DepartmentBean();
		departmentBean.setDeptId(2);
		departmentBean.setDeptName("HR");
		return departmentBean;
		
	}
	@Bean(name="ac")
	public DepartmentBean getACDepartment() {
		DepartmentBean departmentBean =new DepartmentBean();
		departmentBean.setDeptId(3);
		departmentBean.setDeptName("AC");
		return departmentBean;
		
	}
}
