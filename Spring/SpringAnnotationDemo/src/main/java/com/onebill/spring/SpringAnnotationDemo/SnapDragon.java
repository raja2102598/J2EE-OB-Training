package com.onebill.spring.SpringAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
//@Primary // for multiple objects
public class SnapDragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("It uses Snapdragon chip");
	}

}
