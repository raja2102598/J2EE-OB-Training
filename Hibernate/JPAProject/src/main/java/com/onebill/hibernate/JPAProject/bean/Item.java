package com.onebill.hibernate.JPAProject.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class Item {
	@Id
	@Column
	private int id;
	@Column
	private String itemname;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="cid")
//	private Cart cart;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private Cart cart;
	
	
//	private Cart cart;


	
	
	
//	public List<Cart> getCart() {
//		return cart;
//	}
//	public void setCart(List<Cart> cart) {
//		this.cart = cart;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + "]";
	}
	
	
}
