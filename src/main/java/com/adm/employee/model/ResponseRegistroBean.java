package com.adm.employee.model;

import java.io.Serializable;

public class ResponseRegistroBean implements Serializable {
	

	private static final long serialVersionUID = 1533101408611868412L;

	private int id;
	private boolean success;
	
	public ResponseRegistroBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
