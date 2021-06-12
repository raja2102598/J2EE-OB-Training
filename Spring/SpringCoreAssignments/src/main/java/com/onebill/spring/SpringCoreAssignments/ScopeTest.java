package com.onebill.spring.SpringCoreAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.spring.SpringCoreAssignments.bean.ScopeDemoBean;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("scopeDemoConfig.xml");
		
//		singleton - (default Scope)only one instance of the spring bean will be created for the spring container.
//		Prototype - new instance for each bean
//		request -for web apps
//		session - for http sessions
//		global-sessions -for portlet apps
		ScopeDemoBean bean1 = (ScopeDemoBean) context.getBean("scope");
		ScopeDemoBean bean2 = (ScopeDemoBean) context.getBean("scope");
		bean1.setId(20);
		bean2.setId(40);
		System.out.println(bean1.getId());
		System.out.println(bean2.getId());
		
	}

}
