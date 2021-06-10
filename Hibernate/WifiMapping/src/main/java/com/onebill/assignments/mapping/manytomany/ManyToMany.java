package com.onebill.assignments.mapping.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.assignments.mapping.manytomany.bean.UserMany;
import com.onebill.assignments.mapping.manytomany.bean.WifiMany;

public class ManyToMany {

	public static void Do() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		WifiMany wifi1 = new WifiMany();
		wifi1.setWId(1);
		wifi1.setWifiName("Jiofi");
		wifi1.setPassword("12345678");

		WifiMany wifi2 = new WifiMany();
		wifi2.setWId(2);
		wifi2.setWifiName("Mobile Hotspot");
		wifi2.setPassword("11111111");

		UserMany user1 = new UserMany();
		user1.setUId(101);
		user1.setDeviceName("Poco F1");
		
		UserMany user2 = new UserMany();
		user2.setUId(102);
		user2.setDeviceName("Moto G5s");

		ArrayList<WifiMany> wifiList = new ArrayList<WifiMany>();
		wifiList.add(wifi1);
		wifiList.add(wifi2);

		user1.setMultipleWifi(wifiList);
		user2.setMultipleWifi(wifiList);

		ArrayList<UserMany> userList = new ArrayList<UserMany>();
		userList.add(user1);
		userList.add(user2);

		wifi1.setUsers(userList);
		wifi2.setUsers(userList);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Wifi");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(wifi1);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
