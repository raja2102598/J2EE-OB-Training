package com.onebill.SpringRestJaxb.bean;


import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;

import lombok.Data;

@Data
@XmlRootElement(name ="employee-info" )
@JsonRootName("employeeInfo")
@JsonPropertyOrder({"employeeId" ,"employeeName"})
@JsonIgnoreProperties({"password" , "salary"})
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeBean implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	@XmlElement(name = "emp-id")
	@XmlAttribute(name = "emp-id")
//	@JsonProperty("employeeId")
	private int empId;
	
	@XmlElement
//	@JsonProperty("employeeName")
	private String name;
	
	@XmlElement(name = "phone")
	@JsonProperty
	private long mobileNumber;
	
	@XmlElement(name = "email-id")
	@JsonProperty
	private String emailId;
	
	@XmlElement
	@JsonProperty
	private Date dob;
	
	@XmlElement
	@JsonProperty
	private Date doj;
	
	@XmlElement(name = "dept-id")
	@JsonProperty
	private int deptId;
	
	@XmlElement
	@JsonProperty
	private double salary;
	
//	@XmlElement
	@XmlTransient
	@JsonIgnore
	private String password;
}
