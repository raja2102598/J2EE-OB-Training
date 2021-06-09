package com.onebill.hibernate.JPAProject.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class Item {
	@Id
	private int id;
	private String itemname;
	
	@OneToOne
	private Cart cart;
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
