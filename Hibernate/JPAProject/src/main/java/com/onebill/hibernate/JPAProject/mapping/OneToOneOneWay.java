package com.onebill.hibernate.JPAProject.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.onebill.hibernate.JPAProject.bean.Cart;
import com.onebill.hibernate.JPAProject.bean.Item;

public class OneToOneOneWay {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Cart c = new Cart();
		c.setCid(1);
		c.setCname("Cart 1");
		
		Item i=new Item();
		i.setId(101);
		i.setItemname("Pen");
		
		
//		i.setCart(c);
		

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(i);
//			to display
			Item find = entityManager.find(Item.class, 101);
			System.out.println(find.getId());	
			System.out.println(find.getItemname());	
//			System.out.println(find.getCart().getCid());	
//			System.out.println(find.getCart().getCname());	
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
