package com.onebill.spring.SpringAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Samsung {
	@Autowired
	@Qualifier("mt")
	MobileProcessor processor;

	public void config() {
		System.out.println("Octo core,8GB");
		processor.process();
	}
}
