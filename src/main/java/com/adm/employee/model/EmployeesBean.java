package com.adm.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
@NamedQuery(name="EmployeesBean.findAll", query="SELECT c FROM EmployeesBean c")
public class EmployeesBean implements Serializable {

	private static final long serialVersionUID = 1265004322525671457L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_ID_EMPLOYEES")
	@SequenceGenerator(sequenceName="SEQ_ID_EMPLOYEES",name="SEQ_ID_EMPLOYEES",allocationSize=1)
	@Column(name="ID",unique=true, nullable = false)
	private int id;
	
	@Column(name="GENDER_ID")
	private int genderId;
	
	@Column(name="JOB_ID")
	private int jobId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="BIRTHDATE")
	private String birthdate;

	public EmployeesBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}
