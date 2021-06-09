package com.onebill.jpa.hql.Assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.Assignments.bean.Employee;

public class FindAllRecords {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();

//			not possible to get all records with find method
//			for(int i=1;i<5;i++) {
			Employee value = entityManager.find(Employee.class, 1);
			System.out.println(value.toString());

//			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
