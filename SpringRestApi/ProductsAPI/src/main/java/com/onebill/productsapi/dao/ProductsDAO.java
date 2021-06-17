package com.onebill.productsapi.dao;

import java.util.List;

import com.onebill.productsapi.bean.ProductsBean;

public interface ProductsDAO {
	
	public ProductsBean getProduct(int id);

	public List<ProductsBean> getAllProducts();

	public boolean addProduct(ProductsBean productsBean);

	public boolean updateProduct(ProductsBean productsBean);

	public boolean deleteProduct(int id);
}
