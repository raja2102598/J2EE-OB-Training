package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.JPAProject.bean.Movie;

public class DeleteDynamic {

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
			String query="delete from Movie where mid=: id";
			Query q=entityManager.createQuery(query);
			q.setParameter("id", Integer.parseInt(args[0]));
			int executeUpdate = q.executeUpdate();
			entityTransaction.commit();
			System.out.println(executeUpdate + " Row Deleted.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
