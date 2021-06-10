package com.onebill.assignments.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.assignments.mapping.onetoone.bean.UserOne;
import com.onebill.assignments.mapping.onetoone.bean.WifiOne;

public class OneToOneTwoWay {
	public static void Do() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		WifiOne wifi1=new WifiOne();
		wifi1.setWId(1);
		wifi1.setWifiName("Jiofi");
		wifi1.setPassword("12345678");
		
		
		UserOne user1=new UserOne();
		user1.setUId(101);
		user1.setDeviceName("Poco F1");
		
		wifi1.setUser(user1);
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Wifi");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(wifi1);
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}


	}

}
