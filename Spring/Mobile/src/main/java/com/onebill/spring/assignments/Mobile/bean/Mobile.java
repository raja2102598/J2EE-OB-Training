package com.onebill.spring.assignments.Mobile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Mobile {

	private String name;
	
	@Autowired
	private Charger charger;

	public Mobile() {
		
	}
	synchronized public void use() {
		if(charger.getPercentage()==0)
			System.out.println("Zero Percentage Plug in Charger");
		else {
			System.out.println("Using "+ name);			
			try {
				while(charger.getPercentage()>0) {
					wait(10);
					System.out.println("Battery drains 1% for each 1 seconds");
					charger.setPercentage(charger.getPercentage()-1);
					System.out.println(charger.getPercentage()+"%");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
