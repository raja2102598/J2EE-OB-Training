package com.onebill.hibernate.JPAProject.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Cart;
import com.onebill.hibernate.JPAProject.bean.Item;

public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		Item item1=new Item();
		item1.setId(100);
		item1.setItemname("Eraser");
		
		Item item2=new Item();
		item2.setId(101);
		item2.setItemname("Pen");
		
		
		Cart cart = new Cart();
		cart.setCid(1);
		cart.setCname("Cart 1");
			
//		item1.setCart(cart);
//		item2.setCart(cart);
		
		ArrayList<Item> itemlist=new ArrayList<Item>();
		itemlist.add(item1);
		itemlist.add(item2);
		cart.setItems(itemlist);
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(cart);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
