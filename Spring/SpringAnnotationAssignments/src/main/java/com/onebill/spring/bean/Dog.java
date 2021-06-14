package com.onebill.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.onebill.spring.SpringAnnotationAssignments.Animal;
@Component
//@Primary
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats pedigree");
	}

	@Override
	public void speak() {
		System.out.println("Dog barks");
	}

}
