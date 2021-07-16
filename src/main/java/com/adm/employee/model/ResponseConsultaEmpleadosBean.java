package com.adm.employee.model;

import java.io.Serializable;
import java.util.List;

public class ResponseConsultaEmpleadosBean implements Serializable  {

	private static final long serialVersionUID = -8002214086601546785L;
	
	private List<EmployeesBean> employess;

	public ResponseConsultaEmpleadosBean() {
		super();
	}

	public List<EmployeesBean> getEmployess() {
		return employess;
	}

	public void setEmployess(List<EmployeesBean> employess) {
		this.employess = employess;
	}
	
	
	
}
