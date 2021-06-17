package com.onebill.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.employeeapi.bean.EmployeeInfo;
import com.onebill.employeeapi.bean.EmployeeResponse;
import com.onebill.employeeapi.service.EmployeeService;


@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getEmployeeData(Integer id) {
		EmployeeInfo employeeInfo = service.getEmp(id);
		EmployeeResponse response = new EmployeeResponse();

		if (employeeInfo != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Found For ID " + id);
			response.setEmployeeInfo(employeeInfo);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("Data Not Found For ID " + id);
		}

		return response;
	}// end of get Employee

	@GetMapping(path = "/getAllEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllData() {

		List<EmployeeInfo> employeeInfos = service.getAllEmpData();
		EmployeeResponse response = new EmployeeResponse();
		if (employeeInfos != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Details Found ");
			response.setEmployeeInfos(employeeInfos);
			;
		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Table is Empty");
		}
		return response;
	}// getAllEmployee

	@DeleteMapping(path = "/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(@PathVariable(name = "id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.deleteData(id)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data deleted for id " + id);

		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Could not Delete the data for " + id);
		}
		return response;
	}// deleteEmp

	@PostMapping(path = "/addEmp", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse addEmployeeData(@RequestBody EmployeeInfo employeeInfo) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employeeInfo)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data inserted");

		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Could not Insert the data ");
		}
		return response;
	}// add Employee

	@PutMapping(path = "/update", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfo employeeInfo) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.updateEmployee(employeeInfo)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Updated");

		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Could not Update the data ");
		}
		return response;
	}

}
