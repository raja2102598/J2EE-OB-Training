package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class DeleteSingleRecord {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Movie movie = entityManager.find(Movie.class, 3);
			entityManager.remove(movie);
			entityTransaction.commit();
			System.out.println("Deleted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
