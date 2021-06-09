package com.onebill.hibernate.JPAProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class GetAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Movie");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String query="from Movie";
		
		Query q=entityManager.createQuery(query);
		List<Movie> resultList = q.getResultList();
		for(Movie m:resultList) {
			System.out.println("Movie id : "+m.getMid());
			System.out.println("Movie Name : "+m.getMname());
			System.out.println("Movie Rating : "+m.getMrating());
			System.out.println("Movie Review : "+m.getMreview());
		}
	}

}
