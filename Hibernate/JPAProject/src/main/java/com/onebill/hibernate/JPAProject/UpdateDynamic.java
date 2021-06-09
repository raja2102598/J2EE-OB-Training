package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Movie");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			String Updatequery="update Movie set mname=:name,mreview=:review,mrating=:rating where mid=:id";
			Query query=entityManager.createQuery(Updatequery);
			query.setParameter("name", args[0]);
			query.setParameter("review", args[1]);
			query.setParameter("rating", Double.parseDouble(args[2]));
			query.setParameter("id", Integer.parseInt(args[3]));
			int executeUpdate = query.executeUpdate();
			entityTransaction.commit();
			System.out.println(executeUpdate + " Rows Updated");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
