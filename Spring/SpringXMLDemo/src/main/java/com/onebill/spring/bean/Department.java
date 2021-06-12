package com.onebill.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {
	private int deptId;
	private String deptName;
	public Department() {
		super();
	}
}
