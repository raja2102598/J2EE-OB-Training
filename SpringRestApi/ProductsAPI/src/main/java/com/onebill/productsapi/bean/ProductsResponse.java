package com.onebill.productsapi.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"statusCode" ,"msg" ,"description"})
public class ProductsResponse {
	
	private int statusCode;
	
	private String msg;
	
	private String description;
	
	private ProductsBean productsBean;
	
	private List<ProductsBean> productsBeans;
}
