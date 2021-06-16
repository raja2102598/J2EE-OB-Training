package com.onebill.SpringRestJaxb.xmltest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.onebill.SpringRestJaxb.bean.EmployeeBean;

public class EmployeeUnMarshalling {

	public static void main(String[] args) {
		try {
			
			JAXBContext context=JAXBContext.newInstance(EmployeeBean.class);
			
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			EmployeeBean unmarshal = (EmployeeBean) createUnmarshaller.unmarshal(new File("employee.xml"));
			System.out.println(unmarshal.toString());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
