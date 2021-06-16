package com.onebill.SpringRestJson.jsontest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.onebill.SpringRestJaxb.bean.UserAddress;
import com.onebill.SpringRestJaxb.bean.UserInfo;

public class UserInfoUnMarshallingJsonTest {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			UserInfo info = mapper.readValue(new File("userinfo.json"), UserInfo.class);
			
			for (UserAddress address : info.getAddress()) {
				System.out.println(address.getHouseNumber());
				System.out.println(address.getStreet());
				System.out.println(address.getCity());
				System.out.println(address.getTypeOfAddress());
				System.out.println("------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
