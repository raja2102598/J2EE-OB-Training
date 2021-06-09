package com.onebill.jpa.hql.Assignments;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicScanner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		int id;
		Scanner scan=new Scanner(System.in);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String query="delete from Employee where id=: id";
			Query q=entityManager.createQuery(query);
			
			System.out.println("Enter the Id :");
			id= scan.nextInt();
			q.setParameter("id", id);
			
			int executeUpdate = q.executeUpdate();
			entityTransaction.commit();
			System.out.println(executeUpdate + " Row Deleted.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
