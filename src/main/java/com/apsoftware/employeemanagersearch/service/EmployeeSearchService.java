package com.apsoftware.employeemanagersearch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apsoftware.employeemanagersearch.document.EmployeeDocument;
import com.apsoftware.employeemanagersearch.repository.EmployeeSearchRepository;

@Service
public class EmployeeSearchService {

	private final EmployeeSearchRepository esRepo;
	
	public EmployeeSearchService(EmployeeSearchRepository esRepo) {
		this.esRepo = esRepo;
	}
	
	public List<EmployeeDocument> searchByName(String name) {
        return esRepo.findByFullNameContaining(name);
    }

    public List<EmployeeDocument> searchByDepartment(String dept) {
        return esRepo.findByDepartment(dept);
    }

    public List<EmployeeDocument> searchByTitle(String title) {
        return esRepo.findByTitleContaining(title);
    }

    // 📥 INDEX ONE
    public EmployeeDocument save(EmployeeDocument doc) {
        return esRepo.save(doc);
    }

    // 📥 INDEX MANY
    public Iterable<EmployeeDocument> saveAll(List<EmployeeDocument> docs) {
        return esRepo.saveAll(docs);
    }
}
