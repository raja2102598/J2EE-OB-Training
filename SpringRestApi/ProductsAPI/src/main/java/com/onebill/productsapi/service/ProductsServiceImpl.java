package com.onebill.productsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.productsapi.bean.ProductsBean;
import com.onebill.productsapi.dao.ProductsDAO;

@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	ProductsDAO dao;
	
	@Override
	public ProductsBean getProduct(int id) {
		if (id < 0) {
			return null;
		}
		return dao.getProduct(id);
	}

	@Override
	public List<ProductsBean> getAllProduct() {
		return dao.getAllProducts();
	}

	@Override
	public boolean addProduct(ProductsBean productsBean) {
		return dao.addProduct(productsBean);
	}

	@Override
	public boolean updateProduct(ProductsBean productsBean) {
		
		return dao.updateProduct(productsBean);
	}

	@Override
	public boolean deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

}
