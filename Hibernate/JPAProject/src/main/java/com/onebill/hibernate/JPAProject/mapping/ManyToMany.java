package com.onebill.hibernate.JPAProject.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.JPAProject.bean.Course;
import com.onebill.hibernate.JPAProject.bean.Student;

public class ManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Raja");

		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("Subash");
		
		Course c1=new Course();
		c1.setCid(10);
		c1.setCname("React");
		
		Course c2=new Course();
		c2.setCid(20);
		c2.setCname("Angular");
		
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		
		c1.setStudents(students);
		c2.setStudents(students);
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		
		s1.setCourses(courses);
		s2.setCourses(courses);
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(c1);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
// TODO Auto-generated method stub

	}

}
