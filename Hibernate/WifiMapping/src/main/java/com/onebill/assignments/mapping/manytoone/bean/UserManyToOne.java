package com.onebill.assignments.mapping.manytoone.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class UserManyToOne {
	@Column
	@Id
	private int uId;
	@Column
	private String deviceName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usermanytoone")
	private List<WifiManyToOne> wifimanytoone;

}
