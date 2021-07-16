package com.adm.employee.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adm.employee.model.EmployeesBean;


public interface IAdminEmployRepository extends CrudRepository<EmployeesBean,Long> {

	@Query(value="select count(*) from EMPLOYEES where name = :nombre and last_name = :apellido", nativeQuery = true)
	int validarNombre(@Param("nombre") String nombre, @Param("apellido") String apellido);
	
	@Query(value="select trunc((trunc(SYSDATE) - trunc(to_date(:fechanac,,'YYYY-MM-DD')))/365) as edad from dual", nativeQuery = true)
	int validarEdad(@Param("fechanac") String fechanac);
	
}
