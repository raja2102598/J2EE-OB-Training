package com.onebill.SpringRestJaxb.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
@XmlRootElement(name = "user-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "emp-id")
//	@XmlAttribute(name="emp-id")
	private int empId;
	@XmlElement
	private String name;
	@XmlElement(name = "email-id")
	private String emailId;
	@XmlElement(name = "dept-id")
	private int deptId;
	@XmlElement
	private double salary;
//	@XmlElement
	@XmlTransient
	private String password;
	@XmlElement(name = "other-info")
	private UserOtherInfo userotherinfo;
//	@XmlElement(name = "user-addresses")
	@XmlElementWrapper(name="user-addresses")
	private List<UserAddress> address;
}
