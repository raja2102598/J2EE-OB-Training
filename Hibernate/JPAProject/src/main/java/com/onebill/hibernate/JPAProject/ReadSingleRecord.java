package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class ReadSingleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Movie");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String query="from Movie where mid=1";
//		String query="from Movie where id=1";
		
		Query q=entityManager.createQuery(query);
		Movie m = (Movie) q.getSingleResult();
		System.out.println("Movie id : "+m.getMid());
		System.out.println("Movie Name : "+m.getMname());
		System.out.println("Movie Rating : "+m.getMrating());
		System.out.println("Movie Review : "+m.getMreview());
	}

}
