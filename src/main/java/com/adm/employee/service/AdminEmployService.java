package com.adm.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adm.employee.model.EmployeesBean;
import com.adm.employee.model.JobsBean;
import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseRegistroBean;
import com.adm.employee.repository.IAdminEmployRepository;
import com.adm.employee.repository.IAdminJobsRepository;

@Service
public class AdminEmployService implements IAdminEmployService {

	@Autowired
	private IAdminEmployRepository adminEmployRepository;
	
	@Autowired
	private IAdminJobsRepository adminJobsRepository;
	
	@Override
	@Transactional
	public ResponseRegistroBean registraEmploy(RequestGeneralBean beanGeneral, String idEmpleado) {
		ResponseRegistroBean registro = new ResponseRegistroBean();		
		Long idJob = Long.valueOf(beanGeneral.getJobId());
		int idRegistro = adminEmployRepository.validarNombre(beanGeneral.getName(), beanGeneral.getLastName());
		int edad = adminEmployRepository.validarEdad(beanGeneral.getBirthdate());
		Optional<JobsBean> puesto = adminJobsRepository.findById(idJob);
		/**Se valida que exista el registro */
		if(puesto.isPresent() && edad >= 18 && idRegistro == 0) {
			EmployeesBean empleado = new EmployeesBean();
			empleado.setGenderId(beanGeneral.getGenderId());
			empleado.setJobId(beanGeneral.getJobId());
			empleado.setName(beanGeneral.getName());
			empleado.setLastName(beanGeneral.getLastName());
			empleado.setBirthdate(beanGeneral.getBirthdate());			
			empleado = adminEmployRepository.save(empleado);
			registro.setId(empleado.getId());
			registro.setSuccess(true);			
		} else {
			registro.setId(0);
			registro.setSuccess(false);	
		}
		return registro;
	}

	
}
