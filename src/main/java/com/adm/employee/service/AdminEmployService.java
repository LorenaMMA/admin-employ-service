package com.adm.employee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adm.employee.model.EmployeesBean;
import com.adm.employee.model.JobsBean;
import com.adm.employee.model.RequestGeneralBean;
import com.adm.employee.model.ResponseConsultaEmpleadosBean;
import com.adm.employee.model.ResponseRegistroBean;
import com.adm.employee.repository.IAdminEmployRepository;
import com.adm.employee.repository.IAdminJobsRepository;
import com.adm.employee.utils.Utils;

@Service
public class AdminEmployService implements IAdminEmployService {

	@Autowired
	private IAdminEmployRepository adminEmployRepository;
	
	@Autowired
	private IAdminJobsRepository adminJobsRepository;
	
	@Override
	@Transactional
	public ResponseRegistroBean registraEmploy(RequestGeneralBean beanGeneral) throws ParseException {
		ResponseRegistroBean registro = new ResponseRegistroBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fechanac = sdf.format(beanGeneral.getBirthdate());
		String nuevaFecha = Utils.sumaDias(fechanac);
		
		int idRegistro = adminEmployRepository.validarNombre(beanGeneral.getName(), beanGeneral.getLastName());		
		int edad = adminEmployRepository.validarEdad(nuevaFecha);
		Optional<JobsBean> puesto = adminJobsRepository.findById(beanGeneral.getJobId());

		/**Se valida que exista el registro */
		if(puesto.isPresent() && edad >= 18 && idRegistro == 0) {
			EmployeesBean empleado = new EmployeesBean();
			empleado.setGenderId(beanGeneral.getGenderId());
			empleado.setJobId(beanGeneral.getJobId());
			empleado.setName(beanGeneral.getName());
			empleado.setLastName(beanGeneral.getLastName());
			empleado.setBirthdate(Utils.formateaFecha(nuevaFecha));			
			empleado = adminEmployRepository.save(empleado);
			registro.setId(empleado.getId());
			registro.setSuccess(true);			
		} else {
			registro.setId(0);
			registro.setSuccess(false);	
		}
		return registro;
	}

	@Override
	public ResponseConsultaEmpleadosBean consultaEmpleado(int idJob) {
		ResponseConsultaEmpleadosBean empleado = new ResponseConsultaEmpleadosBean();
		Iterable<EmployeesBean> empleadosList = adminEmployRepository.findAll();
		
		return empleado;
	}

	
}
