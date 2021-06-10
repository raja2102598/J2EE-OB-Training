package com.onebill.assignments.mapping.onetomany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "wifi")
@Entity
public class WifiOneToMany {
	@Column
	@Id
	private int wId;
	@Column
	private String WifiName;
	@Column
	private String password;
//	fetch = FetchType.LAZY -- Loads Data When Get Functions or find is called.
//	fetch =FetchType.EAGER -- Loads Data At Start
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "wifionetomany",fetch =FetchType.LAZY)
	private List<UserOneToMany> user;
}
