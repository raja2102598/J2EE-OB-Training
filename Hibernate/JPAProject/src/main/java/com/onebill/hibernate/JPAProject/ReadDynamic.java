package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class ReadDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
			entityManager = entityManagerFactory.createEntityManager();
			String q="from Movie where mid=: movieid";
			Query query=entityManager.createQuery(q);
			query.setParameter("movieid", Integer.parseInt(args[0]));
			
			Movie movie=(Movie) query.getSingleResult();
			System.out.println(movie.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
