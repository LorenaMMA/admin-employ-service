package com.adm.employee.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_WORKED_HOURS")
@NamedQuery(name="EmployeeWorkedHoursBean.findAll", query="SELECT c FROM EmployeeWorkedHoursBean c")
public class EmployeeWorkedHoursBean implements Serializable {

	private static final long serialVersionUID = -1377000840301084842L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_ID_EMPLOYEES_WH")
	@SequenceGenerator(sequenceName="SEQ_ID_EMPLOYEES_WH",name="SEQ_ID_EMPLOYEES_WH",allocationSize=1)
	@Column(name="ID",unique=true, nullable = false)
	private int id;
	
	
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name="WORKED_HOURS")
	private int workedHours;
	
	@Column(name="WORKED_DATE")
	private Date workedDate;

	public EmployeeWorkedHoursBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public Date getWorkedDate() {
		return workedDate;
	}

	public void setWorkedDate(Date workedDate) {
		this.workedDate = workedDate;
	}	
}
