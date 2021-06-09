package com.onebill.jpa.hql.Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicFile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			
			String query="delete from Employee where id=: id";
			Query q=entityManager.createQuery(query);
			
			FileReader f=new FileReader("D://OneBill/Training - Zoom/Eclipse_Projects/J2EE/Hibernate/Id.txt");
			BufferedReader br=new BufferedReader(f);
			int read =Integer.parseInt(br.readLine());
//			System.out.println(read);
			q.setParameter("id", read);
			int executeUpdate = q.executeUpdate();
			
			entityTransaction.commit();
			System.out.println(executeUpdate + " Row Deleted.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
