package com.onebill.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.onebill.spring.SpringAnnotationAssignments.Animal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Primary
@Data
@AllArgsConstructor
public class Cat implements Animal {

	private String name;

	public Cat() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish");
	}

	@Override
	public void speak() {
		System.out.println("Meou Meou");
	}

	@PostConstruct
	public void postConstruct() {
		name = "Kitty";
		System.out.println("Hello " + name);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Bye " + name);
	}
}
