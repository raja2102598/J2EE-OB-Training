package com.onebill.employeeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.employeeapi.bean.EmployeeInfo;
import com.onebill.employeeapi.dao.EmployeeDAO;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;

	@Override
	public EmployeeInfo getEmp(int id) {
		if (id < 0) {
			return null;
		}
		return dao.getEmp(id);
	}

	@Override
	public List<EmployeeInfo> getAllEmpData() {
		System.out.println("service Layer");
		return dao.getAllEmpData();
	}

	@Override
	public boolean deleteData(int id) {

		return dao.deleteData(id);
	}

	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {

		return dao.addEmployee(employeeInfo);
	}

	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {

		return dao.updateEmployee(employeeInfo);
	}

}
