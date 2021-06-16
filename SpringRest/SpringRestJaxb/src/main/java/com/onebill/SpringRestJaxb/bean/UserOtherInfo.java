package com.onebill.SpringRestJaxb.bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "other-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserOtherInfo {
	@XmlElement
	private int age;
	@XmlElement(name = "is-married")
	private boolean isMarried;
}
