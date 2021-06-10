package com.onebill.assignments.mapping.manytomany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class UserMany {
	@Column
	@Id
	private int uId;
	@Column
	private String deviceName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "wifi_connections", joinColumns = @JoinColumn(name = "uId"), inverseJoinColumns = @JoinColumn(name = "wId"))
	private List<WifiMany> multipleWifi;
}
