package com.apsoftware.employeemanagersearch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apsoftware.employeemanagersearch.document.EmployeeDocument;
import com.apsoftware.employeemanagersearch.service.EmployeeSearchService;

@RestController
@RequestMapping("/search")
public class EmployeeSearchController {
	private final EmployeeSearchService service;

    public EmployeeSearchController(EmployeeSearchService service) {
        this.service = service;
    }

    // 🔍 search by name
    @GetMapping("/name")
    public List<EmployeeDocument> searchByName(@RequestParam String q) {
        return service.searchByName(q);
    }

    // 🔍 search by department
    @GetMapping("/department")
    public List<EmployeeDocument> searchByDepartment(@RequestParam String dept) {
        return service.searchByDepartment(dept);
    }

    // 🔍 search by title
    @GetMapping("/title")
    public List<EmployeeDocument> searchByTitle(@RequestParam String title) {
        return service.searchByTitle(title);
    }

    // 📥 index single employee
    @PostMapping
    public EmployeeDocument save(@RequestBody EmployeeDocument doc) {
        return service.save(doc);
    }
}
