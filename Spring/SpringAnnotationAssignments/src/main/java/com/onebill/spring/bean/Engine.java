package com.onebill.spring.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component
@AllArgsConstructor
public class Engine {
	private String engineName;

	public Engine() {
		super();
	}
}
