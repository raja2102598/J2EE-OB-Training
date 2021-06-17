package com.onebill.employeeapi.dao;

import java.util.List;

import com.onebill.employeeapi.bean.EmployeeInfo;

public interface EmployeeDAO {

	public EmployeeInfo getEmp(int id);

	public List<EmployeeInfo> getAllEmpData();

	public boolean deleteData(int id);

	public boolean addEmployee(EmployeeInfo employeeInfo);

	public boolean updateEmployee(EmployeeInfo employeeInfo);
}
