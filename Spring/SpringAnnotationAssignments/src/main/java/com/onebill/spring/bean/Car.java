package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
@AllArgsConstructor
public class Car {
	private String id;
	private String carName;
	@Autowired(required = false)
	private Engine engine;
	
	public Car() {
		super();
	}
}
