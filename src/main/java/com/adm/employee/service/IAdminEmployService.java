package com.adm.employee.service;

import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseRegistroBean;

public interface IAdminEmployService {
	
	ResponseRegistroBean registraEmploy(RequestGeneralBean beanGeneral, String idProveedor);

}
