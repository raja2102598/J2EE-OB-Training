package com.onebill.SpringRestJson.jsontest;

import java.io.File;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.SpringRestJaxb.bean.EmployeeBean;

public class EmployeeJSONMarshalling {

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
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("employee.json"), bean);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
