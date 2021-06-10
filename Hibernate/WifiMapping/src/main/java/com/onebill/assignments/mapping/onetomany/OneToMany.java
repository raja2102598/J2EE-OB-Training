package com.onebill.assignments.mapping.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.assignments.mapping.onetomany.bean.WifiOneToMany;
import com.onebill.assignments.mapping.onetomany.bean.UserOneToMany;

public class OneToMany {
	public static void Do() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		WifiOneToMany wifi1 = new WifiOneToMany();
		wifi1.setWId(1);
		wifi1.setWifiName("Jiofi");
		wifi1.setPassword("12345678");

		UserOneToMany user1 = new UserOneToMany();
		user1.setUId(101);
		user1.setDeviceName("Poco F1");
		user1.setWifionetomany(wifi1);

		UserOneToMany user2=new UserOneToMany();
		user2.setUId(102);
		user2.setDeviceName("Mi notebook 14");
		user2.setWifionetomany(wifi1);
		UserOneToMany user3=new UserOneToMany();
		user3.setUId(103);
		user3.setDeviceName("Vivo y15");
		user3.setWifionetomany(wifi1);

		ArrayList<UserOneToMany> usersList=new ArrayList<UserOneToMany>();
		usersList.add(user1);
		usersList.add(user2);
		usersList.add(user3);

		wifi1.setUser(usersList);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Wifi");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(wifi1);
//			WifiOneToMany find = entityManager.find(WifiOneToMany.class, 1);
//			System.out.println(find.getWifiName());
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
