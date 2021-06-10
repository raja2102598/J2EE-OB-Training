package com.onebill.assignments.mapping.onetomany.bean;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class UserOneToMany {
	@Column
	@Id
	private int uId;
	@Column
	private String deviceName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="wId")	
	private WifiOneToMany wifionetomany;
}
