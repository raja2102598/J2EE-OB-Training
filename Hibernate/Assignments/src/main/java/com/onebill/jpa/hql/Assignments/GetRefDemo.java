package com.onebill.jpa.hql.Assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.onebill.hibernate.Assignments.bean.Employee;

public class GetRefDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
//			getting reference of given id object of employee
			Employee reference = entityManager.getReference(Employee.class, 1);
			System.out.println(reference.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
