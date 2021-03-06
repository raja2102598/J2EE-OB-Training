package com.onebill.hibernate.JPAProject.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column
	private int cid;
	@Column
	private String cname;

//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cart")
//	private Item item;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private List<Item> items;
	
}
