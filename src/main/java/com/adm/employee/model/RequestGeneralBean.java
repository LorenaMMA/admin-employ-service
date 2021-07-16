package com.adm.employee.model;

import java.io.Serializable;

public class RequestGeneralBean implements Serializable {

	private static final long serialVersionUID = 1641776873115039054L;
	
	private int genderId;
	private int jobId;
	private String name;
	private String lastName;
	private String birthdate;
	
	/**
	 * Nueva instancia request general bean.
	 */
	public RequestGeneralBean() {
		super();
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
