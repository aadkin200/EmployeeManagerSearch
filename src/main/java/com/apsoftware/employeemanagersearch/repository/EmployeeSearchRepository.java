package com.apsoftware.employeemanagersearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.apsoftware.employeemanagersearch.document.EmployeeDocument;

public interface EmployeeSearchRepository extends ElasticsearchRepository<EmployeeDocument, Integer>{
	
	List<EmployeeDocument> findByFullNameContaining(String name);
	List<EmployeeDocument> findByDepartment(String department);
	List<EmployeeDocument> findByTitleContaining(String title);

}
