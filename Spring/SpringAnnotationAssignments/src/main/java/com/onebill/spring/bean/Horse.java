package com.onebill.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.onebill.spring.SpringAnnotationAssignments.Animal;

@Component
//@Primary
public class Horse implements Animal {

	@Override
	public void eat() {
		System.out.println("Horse Eats Grass");
		
	}

	@Override
	public void speak() {
		System.out.println("Horse neighs");
	}

}
