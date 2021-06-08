package com.onebill.hibernate.Assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.Assignments.bean.Employee;

public class AppJPA {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(4);
		e.setName("def");
		e.setSalary(30000);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
		System.out.println("Data Saved");
	}

}
