package com.onebill.hibernate.Assignments;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.Assignments.bean.Employee;

/**
 * Hello world!
 *
 */
public class AppHibernate 
{
    public static void main( String[] args )
    {
        Employee e=new Employee();
        e.setId(2);
        e.setName("cde");
        e.setSalary(10000);
        
        Configuration conf=new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory factory=conf.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(e);
        transaction.commit();
        System.out.println("Saved Successfully");
    }
}
