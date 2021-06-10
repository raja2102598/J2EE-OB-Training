package com.onebill.assignments.mapping.onetoone.bean;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "User")
public class UserOne {
	@Column
	@Id
	private int uId;
	@Column
	private String deviceName;
	
//	@OneToOne(cascade = CascadeType.ALL)
	@Exclude
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wId")
	private WifiOne wifi;
}
