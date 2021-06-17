package com.onebill.productsapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.onebill.productsapi.bean.ProductsBean;
import com.onebill.productsapi.customexceptions.ProductsException;

@Repository
public class ProductsDAOHibernateImpl implements ProductsDAO {

	@Override
	public ProductsBean getProduct(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("product");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductsBean find = entityManager.find(ProductsBean.class, id);
		if (find != null) {
			return find;
		} else {
			throw new ProductsException("No Data Found");
		}
	}

	@Override
	public List<ProductsBean> getAllProducts() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("product");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query createQuery = entityManager.createQuery("from ProductsBean");
		List<ProductsBean> resultList = createQuery.getResultList();
		if (resultList != null) {
			return resultList;
		} else {
			throw new ProductsException("No Data Found");
		}
	}

	@Override
	public boolean addProduct(ProductsBean productsBean) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(productsBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductsBean productsBean) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();

			ProductsBean originalData = manager.find(ProductsBean.class, productsBean.getId());

			if (productsBean.getName() != null && productsBean.getName() != " ") {
				originalData.setName(productsBean.getName());
			}

			if (productsBean.getPrice() > 0) {
				originalData.setPrice(productsBean.getPrice());
			}

			if (productsBean.getStock() > 0) {
				originalData.setStock(productsBean.getStock());
			}

			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("product");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			ProductsBean bean = manager.find(ProductsBean.class, id);
			manager.remove(bean);
			transaction.commit();
			manager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

}
