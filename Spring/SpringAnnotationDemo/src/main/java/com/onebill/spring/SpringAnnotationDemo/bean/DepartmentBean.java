package com.onebill.spring.SpringAnnotationDemo.bean;

import lombok.Data;

@Data
public class DepartmentBean {
	private int deptId;
	private String deptName;

	public DepartmentBean() {
		super();
	}
}
