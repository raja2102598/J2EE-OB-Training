package com.onebill.productsapi.controller;

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

import com.onebill.productsapi.bean.ProductsBean;
import com.onebill.productsapi.bean.ProductsResponse;
import com.onebill.productsapi.service.ProductsService;

@RestController
public class ProductRestController {
	@Autowired
	ProductsService service;

	@GetMapping(path = "/getProduct/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ProductsResponse getProduct(@PathVariable(name = "id") int id) {
		ProductsBean product = service.getProduct(id);
		ProductsResponse response = new ProductsResponse();

		if (product != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data Found For ID " + id);
			response.setProductsBean(product);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("Data Not Found For ID " + id);
		}

		return response;
	}

	@GetMapping(path = "/getAllProduct", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ProductsResponse getAllProducts() {

		List<ProductsBean> products = service.getAllProduct();
		ProductsResponse response = new ProductsResponse();
		if (products != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Details Found ");
			response.setProductsBeans(products);
		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Table is Empty");
		}
		return response;
	}

	@PostMapping(path = "/addProduct", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ProductsResponse addProduct(@RequestBody ProductsBean productsBean) {

		ProductsResponse response = new ProductsResponse();
		if (service.addProduct(productsBean)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data inserted");

		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Could not Insert the data ");
		}
		return response;
	}
	
	@PutMapping(path = "/updateProduct", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ProductsResponse updateEmployee(@RequestBody ProductsBean productsBean) {
		ProductsResponse response = new ProductsResponse();
		if (service.updateProduct(productsBean)) {
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
	
	@DeleteMapping(path = "/deleteProduct/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ProductsResponse deleteProduct(@PathVariable(name = "id") int id) {
		ProductsResponse response = new ProductsResponse();
		if (service.deleteProduct(id)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data deleted for id " + id);

		} else {
			response.setStatusCode(400);
			response.setMsg("Failure");
			response.setDescription("Could not Delete the data for " + id);
		}
		return response;
	}


}
