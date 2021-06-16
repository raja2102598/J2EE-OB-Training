package com.onebill.SpringRestJaxb.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user-address")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserAddress {
	@XmlElement(name = "house-number")
	private int houseNumber;
	@XmlElement
	private String street;
	@XmlElement
	private String city;
	@XmlElement(name = "address-type")
	private char typeOfAddress;

}
