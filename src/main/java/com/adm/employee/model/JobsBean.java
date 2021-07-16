package com.adm.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
@NamedQuery(name="JobsBean.findAll", query="SELECT c FROM JobsBean c")
public class JobsBean implements Serializable {
	
	private static final long serialVersionUID = -137589214052896562L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",unique=true, nullable = false)
	private int id;
	
	@Column(name="NAME")
	private int name;
	
	@Column(name="SALARY")
	private Double salary;

	public JobsBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
