package com.onebill.spring.SpringAnnotationDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mt")
//@Primary
public class Mediatek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("Using Mediatek Dimensity Processor");
	}

}
