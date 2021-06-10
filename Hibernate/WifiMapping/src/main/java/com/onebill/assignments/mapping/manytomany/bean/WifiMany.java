package com.onebill.assignments.mapping.manytomany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="wifi")
@Entity
public class WifiMany {

	@Column
	@Id
	private int wId;
	@Column
	private String WifiName;
	@Column
	private String password;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "multipleWifi")
	private List<UserMany> Users;
}
