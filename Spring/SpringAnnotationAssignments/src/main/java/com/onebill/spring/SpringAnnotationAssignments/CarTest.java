package com.onebill.spring.SpringAnnotationAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.Car;
import com.onebill.spring.config.CarConfig;


public class CarTest
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
      Car bean = context.getBean(Car.class);
      bean.setCarName("Audi A7");
      bean.setId("1");
      bean.getEngine().setEngineName("V8 Turbo");
      System.out.println(bean.toString());
    }
}
