package com.onebill.jpa.hql.Assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Parameter;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.Assignments.bean.Employee;

public class AllGetMethods {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();

			String query = "from Employee";

			Query queryObj = entityManager.createQuery(query);
			
//			The position of the first result the query object was set to retrieve. Returns 0 if setFirstResult was 
//			not applied to the query object.
			
			int firstResult = queryObj.getFirstResult();
			System.out.println("getFirstResult : "+firstResult);

//			Get the properties and hints and associated values that are in effect for the query instance.
			
			Map<String, Object> hints = queryObj.getHints();
			Set<Entry<String, Object>> entrySet = hints.entrySet();
			System.out.println("\ngetHints");
			for (Entry<String, Object> o : entrySet) {
				System.out.println("Key : "+o.getKey());
				System.out.println("Value :"+o.getValue());
			}
			
//			The maximum number of results the query object was set to retrieve. 
//			Returns Integer.MAX_VALUE if setMaxResults was not applied to the query object.
			queryObj.setMaxResults(100);
			System.out.println("\ngetMaxResults");
			int maxResults = queryObj.getMaxResults();
			System.out.println("Max Results : "+maxResults);

			System.out.println("\ngetResultList");
			List<Employee> resultList = queryObj.getResultList();
			for(Employee Person:resultList) {
				System.out.println(Person.toString());
			}
			
			
			System.out.println("\ngetResultStream");
			Stream<Employee> resultStream = queryObj.getResultStream();
			resultStream.forEach(s->System.out.println(s.toString()));
			
			
			queryObj.setMaxResults(1);
//			Because the above query return all the Data,
//			But here we need one data,Otherwise it causes NonUniqueResultException
			System.out.println("\ngetSingleResult");
			Employee singleResult = (Employee) queryObj.getSingleResult();
			System.out.println(singleResult.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
