package com.onebill.SpringRestJson.jsontest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.SpringRestJaxb.bean.EmployeeBean;


public class EmployeeUnMarshallingJsonTest {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			EmployeeBean infoBean = mapper.readValue(new File("employee.json"), EmployeeBean.class);

			System.out.println(infoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
