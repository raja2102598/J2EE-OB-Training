package com.onebill.assignments.mapping.onetoone.bean;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Table(name="wifi")
@Entity
public class WifiOne {

	@Column
	@Id
	private int wId;
	@Column
	private String WifiName;
	@Column
	private String password;

//	@OneToOne(cascade = CascadeType.ALL)
	@Exclude
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "wifi")
	private UserOne user;
}
