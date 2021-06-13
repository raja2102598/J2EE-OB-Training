package com.onebill.spring.assignments.Mobile.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Charger {
	private int percentage;
	public Charger() {

	}
	synchronized public void charging() {
		if(percentage<100) {
		while(percentage<100) {
			try {
				wait(10);
				percentage++;
				System.out.println(percentage + "%");
				if(percentage==100)
					System.out.println("Battery Full... Remove the plug ...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}else {
			System.out.println("Battery Full... Remove the plug ...");
		}
	}
}
