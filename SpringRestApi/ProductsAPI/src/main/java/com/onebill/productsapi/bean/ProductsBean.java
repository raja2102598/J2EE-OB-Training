package com.onebill.productsapi.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductsBean implements Serializable {

	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int price;
	
	@Column
	private int stock;

}
