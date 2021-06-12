package com.onebill.spring.SpringCoreAssignments.bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car{
	private String id;
	private String carName;
	@Autowired
	private Engine engine;

	public Car() {
		super();
	}
}
