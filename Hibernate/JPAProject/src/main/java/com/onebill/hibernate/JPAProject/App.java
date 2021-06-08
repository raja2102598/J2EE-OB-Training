package com.onebill.hibernate.JPAProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Movie o=new Movie();
		o.setMid(1);
		o.setMname("Avengers");
		o.setMrating(8.5);
		o.setMreview("Good Movie");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Movie");
//		specifying the persistence unit
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(o);
		transaction.commit();
		System.out.println("Saved");
//		manager.
    }
}
