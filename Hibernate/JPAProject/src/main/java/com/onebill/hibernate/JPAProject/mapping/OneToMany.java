package com.onebill.hibernate.JPAProject.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Cart;
import com.onebill.hibernate.JPAProject.bean.Item;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		Item item1=new Item();
		item1.setId(100);
		item1.setItemname("Eraser");
		
		Cart cart1 = new Cart();
		cart1.setCid(1);
		cart1.setCname("Cart 1");
			
		Cart cart2 = new Cart();
		cart2.setCid(1);
		cart2.setCname("Cart 1");
		
		item1.setCart(cart1);
		item1.setCart(cart2);
		
		ArrayList<Cart> itemlist=new ArrayList<Cart>();
		itemlist.add(cart1);
		itemlist.add(cart2);
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(item1);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
