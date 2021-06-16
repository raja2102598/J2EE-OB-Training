package com.onebill.SpringRestJaxb.xmltest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


import com.onebill.SpringRestJaxb.bean.UserInfo;

public class UserInfoUnmarshalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext context=JAXBContext.newInstance(UserInfo.class);
			
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			UserInfo unmarshal = (UserInfo) createUnmarshaller.unmarshal(new File("userinfo.xml"));
			System.out.println(unmarshal);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
