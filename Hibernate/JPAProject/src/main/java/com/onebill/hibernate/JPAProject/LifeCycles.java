package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class LifeCycles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			Movie movie = entityManager.find(Movie.class, 3);
			System.out.println("Before detach "+ entityManager.contains(movie));
			
			entityManager.detach(movie);
			System.out.println("After detach "+ entityManager.contains(movie));
			
			Movie mergedObj = entityManager.merge(movie);
			System.out.println("After merge() "+ entityManager.contains(mergedObj));
			
			mergedObj.setMname("Loki");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
