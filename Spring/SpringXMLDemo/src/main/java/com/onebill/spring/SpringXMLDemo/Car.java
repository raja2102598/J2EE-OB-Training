package com.onebill.spring.SpringXMLDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	@Override
	public void drive() {
		System.out.println("Car with tyre brand - " +tyre.getBrand());
	}
	public Car() {
		super();
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	

}
