package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class FindMovie {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Movie");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie movie = entityManager.find(Movie.class, 1);
		System.out.println("Movie id : "+movie.getMid());
		System.out.println("Movie Name : "+movie.getMname());
		System.out.println("Movie Rating : "+movie.getMrating());
		System.out.println("Movie Review : "+movie.getMreview());
	}

}
