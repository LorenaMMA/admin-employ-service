package com.adm.employee.service;

import java.text.ParseException;

import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseConsultaEmpleadosBean;
import com.adm.employee.model.ResponseRegistroBean;

public interface IAdminEmployService {
	
	ResponseRegistroBean registraEmploy(RequestGeneralBean beanGeneral) throws ParseException;

	ResponseConsultaEmpleadosBean consultaEmpleado(int idJob);
	
}
