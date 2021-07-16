package com.adm.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseRegistroBean;
import com.adm.employee.service.IAdminEmployService;

@RestController
@RequestMapping(value = "/admin-employ-service")
public class AdminEmployController {

	@Autowired
	private IAdminEmployService adminService;


	@PutMapping(value= "/register/{idemploy}")
	public ResponseEntity<ResponseRegistroBean> actualizarEmpleado(
			@PathVariable("idemploy") final String empleado, @RequestBody RequestGeneralBean request) {
		/**Se inicializan los objetos*/
		JSONObject json = new JSONObject();
		ResponseRegistroBean datos = adminService.registraEmploy(request, empleado);
		/** Retorno de respuesta de la peticion */
		return new ResponseEntity<ResponseRegistroBean>(datos, HttpStatus.OK);
	}
}
