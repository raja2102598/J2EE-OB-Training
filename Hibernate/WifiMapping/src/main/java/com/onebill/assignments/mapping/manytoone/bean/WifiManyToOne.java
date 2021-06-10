package com.onebill.assignments.mapping.manytoone.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "wifi")
@Entity
public class WifiManyToOne {
	@Column
	@Id
	private int wId;
	@Column
	private String WifiName;
	@Column
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uId")	
	private UserManyToOne usermanytoone;
}
