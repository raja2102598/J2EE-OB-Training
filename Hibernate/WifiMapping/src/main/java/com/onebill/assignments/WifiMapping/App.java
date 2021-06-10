package com.onebill.assignments.WifiMapping;

import java.util.Scanner;

import com.onebill.assignments.mapping.manytomany.ManyToMany;
import com.onebill.assignments.mapping.manytoone.ManyToOne;
import com.onebill.assignments.mapping.onetomany.OneToMany;
import com.onebill.assignments.mapping.onetoone.OneToOne;
import com.onebill.assignments.mapping.onetoone.OneToOneTwoWay;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan=new Scanner(System.in);
    	System.out.println( "Welcome To Wifi Mapping\n1.One To One \n2.One To Many \n3.Many To One\n4.Many to Many\n" );
        System.out.print("Enter Your Choice : ");
        int ch=scan.nextInt();
        
        switch (ch) {
		case 1:
			System.out.println("1.One Way\n2.Two Way\n");
			System.out.print("Enter Your Choice: ");
			int ch1=scan.nextInt();
			switch (ch1) {
			case 1:
				OneToOne.Do();				
				break;
			case 2:
				OneToOneTwoWay.Do();
				break;
			default:
				break;
			}
			break;
		case 2:
			OneToMany.Do();
			break;
		case 3:
			ManyToOne.Do();
			break;
		case 4:
			ManyToMany.Do();
			break;
		default:
			break;
		}
        scan.close();
    }
}
