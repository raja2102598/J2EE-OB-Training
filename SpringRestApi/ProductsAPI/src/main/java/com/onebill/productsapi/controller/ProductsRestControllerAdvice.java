package com.onebill.productsapi.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onebill.productsapi.bean.ProductsResponse;
import com.onebill.productsapi.customexceptions.ProductsException;


@RestControllerAdvice 
public class ProductsRestControllerAdvice {

	@ExceptionHandler(ProductsException.class)
	public ProductsResponse handleEmployeeExcpetion(ProductsException exception) {
		ProductsResponse response = new ProductsResponse();
		response.setStatusCode(500);
		response.setMsg("failure");
		response.setDescription(exception.getMessage());
		return response;
	}
}
