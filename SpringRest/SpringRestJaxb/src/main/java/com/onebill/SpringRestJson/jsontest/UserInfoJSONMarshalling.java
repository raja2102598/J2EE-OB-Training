package com.onebill.SpringRestJson.jsontest;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.SpringRestJaxb.bean.UserAddress;
import com.onebill.SpringRestJaxb.bean.UserInfo;
import com.onebill.SpringRestJaxb.bean.UserOtherInfo;


public class UserInfoJSONMarshalling {

	public static void main(String[] args) {

		UserInfo userInfo = new UserInfo();

		userInfo.setEmailId("sai@te.com");
		userInfo.setEmpId(10);
		userInfo.setName("SAI");
		userInfo.setPassword("qwerty");
		userInfo.setSalary(250000);

		UserOtherInfo userOtherInfo = new UserOtherInfo();
		userOtherInfo.setAge(23);
		userOtherInfo.setMarried(false);

		UserAddress tempAdd = new UserAddress();
		tempAdd.setCity("BLR");
		tempAdd.setHouseNumber(100);
		tempAdd.setStreet("MG Road");
		tempAdd.setTypeOfAddress('T');

		UserAddress pAdd = new UserAddress();
		pAdd.setCity("Pune");
		pAdd.setHouseNumber(200);
		pAdd.setStreet("Shivaji Nagar");
		pAdd.setTypeOfAddress('P');

		UserAddress gAdd = new UserAddress();
		gAdd.setCity("Mumbai");
		gAdd.setHouseNumber(300);
		gAdd.setStreet("Shivaji Nagar");
		gAdd.setTypeOfAddress('G');

		List<UserAddress> addresses = new ArrayList<UserAddress>();
		addresses.add(tempAdd);
		addresses.add(gAdd);
		addresses.add(pAdd);

		userInfo.setUserotherinfo(userOtherInfo);
		userInfo.setAddress(addresses);

		
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("userinfo.json"), userInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
