package com.onebill.spring.LifeCycles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.LifeCycles.bean.Company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AllConf.xml");
       Company bean = (Company) applicationContext.getBean("company");
       System.out.println("Changing name using postProcessBeanFactory \nName : "+bean.getName());
       bean.setName("Hello");
       System.out.println("Changing name in Main Class \nName : "+bean.getName());
       
       ((AbstractApplicationContext)applicationContext).close();
    }
}
