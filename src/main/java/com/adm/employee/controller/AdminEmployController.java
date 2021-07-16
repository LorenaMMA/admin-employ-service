package com.adm.employee.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseConsultaEmpleadosBean;
import com.adm.employee.model.ResponseRegistroBean;
import com.adm.employee.service.IAdminEmployService;

@RestController
@RequestMapping(value = "/admin-employ-service")
public class AdminEmployController {

	@Autowired
	private IAdminEmployService adminService;


	@PutMapping(value= "/register")
	public ResponseEntity<ResponseRegistroBean> actualizarEmpleado(@RequestBody RequestGeneralBean request) {
		/**Se inicializan los objetos*/
		ResponseRegistroBean datos = new ResponseRegistroBean();
		try {
			datos = adminService.registraEmploy(request);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/** Retorno de respuesta de la peticion */
		return new ResponseEntity<ResponseRegistroBean>(datos, HttpStatus.OK);
	}
	
	@GetMapping(value= "/request/{jobId}")
	public ResponseEntity<ResponseConsultaEmpleadosBean> consultarEmpleados(@PathVariable int jobId) {
		/**Se inicializan los objetos*/
		ResponseConsultaEmpleadosBean datos = new ResponseConsultaEmpleadosBean();
		
		datos = adminService.consultaEmpleado(jobId);
		
		/** Retorno de respuesta de la peticion */
		return new ResponseEntity<ResponseConsultaEmpleadosBean>(datos, HttpStatus.OK);
	}
}
