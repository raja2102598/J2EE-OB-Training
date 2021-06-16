package com.onebill.SpringRestJaxb.xmltest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.onebill.SpringRestJaxb.bean.UserAddress;
import com.onebill.SpringRestJaxb.bean.UserInfo;
import com.onebill.SpringRestJaxb.bean.UserOtherInfo;

public class UserInfoMarshalling {

	public static void main(String[] args) {
		UserInfo info=new UserInfo();
		info.setDeptId(1);
		info.setEmailId("r@g.com");
		info.setEmpId(2);
		info.setName("Raja");
		info.setPassword("123");
		info.setSalary(100000);
		
		UserOtherInfo otherInfo=new UserOtherInfo();
		otherInfo.setAge(20);
		otherInfo.setMarried(false);
		
		UserAddress taddress=new UserAddress();
		taddress.setTypeOfAddress('T');
		taddress.setCity("chennai");
		taddress.setHouseNumber(1);
		taddress.setStreet("a");
		UserAddress paddress=new UserAddress();
		paddress.setTypeOfAddress('T');
		paddress.setCity("chennai");
		paddress.setHouseNumber(1);
		paddress.setStreet("a");
		
		List<UserAddress> addresses=new ArrayList<UserAddress>();
		addresses.add(taddress);
		addresses.add(paddress);
		
		info.setUserotherinfo(otherInfo);
		info.setAddress(addresses);
		
		try {
			
			JAXBContext context= JAXBContext.newInstance(UserInfo.class);
			Marshaller createMarshaller = context.createMarshaller();
			createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(info, System.out);
			createMarshaller.marshal(info, new File("userinfo.xml"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
