package com.onebill.jpa.hql.Assignments;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.Assignments.bean.Employee;

public class SqlAggregateFunctions {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String maxQuery="select max(sal) from Employee";
			String avgQuery="select avg(sal) from Employee";			
			String sumQuery="select sum(sal) from Employee";
			
			Query createQueryMax = entityManager.createQuery(maxQuery);
			int maxResult = (int) createQueryMax.getSingleResult();
			System.out.println("Maximum Salary : "+maxResult);
			
			Query createQueryAvg = entityManager.createQuery(avgQuery);
			double avgResult = (double) createQueryAvg.getSingleResult();
			System.out.println("Average Salary : "+avgResult);
			
			Query createQuerySum = entityManager.createQuery(sumQuery);
			long sumResult = (long) createQuerySum.getSingleResult();
			System.out.println("Sum of Salaries : "+sumResult);
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
