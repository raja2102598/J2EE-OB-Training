package com.onebill.hibernate.JPAProject.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Cart;
import com.onebill.hibernate.JPAProject.bean.Item;

public class OneToOneTwoWay {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Cart cart = new Cart();
		cart.setCid(3);
		cart.setCname("Cart 3");
		
		Item item=new Item();
		item.setId(103);
		item.setItemname("Eraser");
		
		
//		cart.setItem(item);
		

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(cart);
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
