package com.onebill.employeeapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.onebill.employeeapi.bean.EmployeeInfo;
import com.onebill.employeeapi.customexceptions.EmployeeException;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
//	@PersistenceUnit
//	private EntityManagerFactory factory;
//	
	@Override
	public EmployeeInfo getEmp(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EmployeeInfo employeeInfo = manager.find(EmployeeInfo.class, id);

		manager.close();
		if (employeeInfo!= null) {
			return employeeInfo;
		}else {
			throw new EmployeeException(" Employee Details not found ");
		}
	}

	
	@Override
	public List<EmployeeInfo> getAllEmpData() {
		System.out.println("Data layer");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from EmployeeInfo");
		List<EmployeeInfo> employeeInfos = query.getResultList();
		manager.close();
		
		return employeeInfos;
	}
	
	@Override
	public boolean deleteData(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			EmployeeInfo info = manager.find(EmployeeInfo.class, id);
			manager.remove(info);
			transaction.commit();
			manager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(employeeInfo);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			
			EmployeeInfo originalData = manager.find(EmployeeInfo.class, employeeInfo.getId());
			
			if (employeeInfo.getDob() !=null ) {
				originalData.setDob(employeeInfo.getDob());
			}
			
			if (employeeInfo.getName() !=null  && employeeInfo.getName() != "") {
				originalData.setName(employeeInfo.getName());
			}
			
			if (employeeInfo.getPassword() != null && employeeInfo.getPassword() != "") {
				originalData.setPassword(employeeInfo.getPassword());
			}
			
			
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}


}
