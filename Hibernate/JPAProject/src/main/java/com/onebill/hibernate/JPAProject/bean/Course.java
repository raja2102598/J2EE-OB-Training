package com.onebill.hibernate.JPAProject.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "courseinfo")
public class Course {

	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	private List<Student> students;
}
