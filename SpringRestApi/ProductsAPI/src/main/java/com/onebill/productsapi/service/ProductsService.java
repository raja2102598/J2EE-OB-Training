package com.onebill.productsapi.service;

import java.util.List;

import com.onebill.productsapi.bean.ProductsBean;

public interface ProductsService {
	public ProductsBean getProduct(int id);

	public List<ProductsBean> getAllProduct();
	
	public boolean addProduct(ProductsBean productsBean);

	public boolean updateProduct(ProductsBean productsBean);

	public boolean deleteProduct(int id);
}
