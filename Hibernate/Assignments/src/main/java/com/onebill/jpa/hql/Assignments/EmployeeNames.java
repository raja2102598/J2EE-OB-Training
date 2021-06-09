package com.onebill.jpa.hql.Assignments;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.Assignments.bean.Employee;

public class EmployeeNames {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
			String query="select name from Employee";
			Query createQuery = entityManager.createQuery(query);
			Stream<String> resultStream = createQuery.getResultStream();
			System.out.println("Employee Names ");
			resultStream.forEach(s->System.out.println(s));			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
