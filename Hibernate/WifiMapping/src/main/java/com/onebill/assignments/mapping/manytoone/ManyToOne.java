package com.onebill.assignments.mapping.manytoone;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.assignments.mapping.manytoone.bean.UserManyToOne;
import com.onebill.assignments.mapping.manytoone.bean.WifiManyToOne;
public class ManyToOne {
	public static void Do() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		WifiManyToOne wifi1 = new WifiManyToOne();
		wifi1.setWId(1);
		wifi1.setWifiName("Jiofi");
		wifi1.setPassword("12345678");

		WifiManyToOne wifi2=new WifiManyToOne();
		wifi2.setWId(2);
		wifi2.setWifiName("Act");
		wifi2.setPassword("12345678");

		
		UserManyToOne user1 = new UserManyToOne();
		user1.setUId(101);
		user1.setDeviceName("Poco F1");
		wifi1.setUsermanytoone(user1);
		wifi2.setUsermanytoone(user1);
		
		ArrayList<WifiManyToOne> wifiList=new ArrayList<WifiManyToOne>();
		wifiList.add(wifi1);
		wifiList.add(wifi2);
		
		user1.setWifimanytoone(wifiList);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Wifi");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(user1);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
