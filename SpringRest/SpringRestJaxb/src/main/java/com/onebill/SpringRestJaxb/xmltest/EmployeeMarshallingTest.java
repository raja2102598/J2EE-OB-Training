package com.onebill.SpringRestJaxb.xmltest;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.onebill.SpringRestJaxb.bean.EmployeeBean;

public class EmployeeMarshallingTest {

	public static void main(String[] args) {
		EmployeeBean bean=new EmployeeBean();
		bean.setDeptId(1);
		bean.setDob(new Date());
		bean.setDoj(new Date());
		bean.setEmailId("Rr@g.com");
		bean.setEmpId(20);
		bean.setMobileNumber(88888);
		bean.setName("Raja");
		bean.setPassword("12");
		bean.setSalary(2699);
		
		try {
			JAXBContext context= JAXBContext.newInstance(EmployeeBean.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(bean, System.out);
			createMarshaller.marshal(bean, new File("employee.xml"));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
