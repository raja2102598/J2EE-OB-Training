package com.onebill.employeeapi.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onebill.employeeapi.bean.EmployeeResponse;
import com.onebill.employeeapi.customexceptions.EmployeeException;

//@ControllerAdvice @ResponseBody

@RestControllerAdvice 
public class EmployeeRestControllerAdvice {

	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handleEmployeeExcpetion(EmployeeException exception) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(500);
		response.setMsg("failure");
		response.setDescription(exception.getMessage());
		return response;
	}
}
