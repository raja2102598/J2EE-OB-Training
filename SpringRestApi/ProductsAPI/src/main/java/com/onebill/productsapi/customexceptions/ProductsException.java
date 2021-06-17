package com.onebill.productsapi.customexceptions;

public class ProductsException extends RuntimeException{

	public ProductsException(String msg) {
		super(msg);
	}
}
