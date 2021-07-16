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
@Table(name="GENDERS")
@NamedQuery(name="GendersBean.findAll", query="SELECT c FROM GendersBean c")
public class GendersBean implements Serializable {

	private static final long serialVersionUID = -5999923602867643229L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",unique=true, nullable = false)
	private int id;
	
	@Column(name="NAME")
	private int name;

	public GendersBean() {
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
		
}
