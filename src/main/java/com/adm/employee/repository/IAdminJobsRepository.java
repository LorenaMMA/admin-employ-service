package com.adm.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.adm.employee.model.JobsBean;

public interface IAdminJobsRepository  extends CrudRepository<JobsBean,Long> {

}
