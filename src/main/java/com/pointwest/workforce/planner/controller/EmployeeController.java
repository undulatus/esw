package com.pointwest.workforce.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pointwest.workforce.planner.data.EmployeeRepository;
import com.pointwest.workforce.planner.domain.Employee;
import com.pointwest.workforce.planner.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	EmployeeServiceImpl empServ;
	
	@RequestMapping("/employees")
    public List<Employee> findAll() {
       return empServ.findAll();
    }
	
	@RequestMapping("/employee")
    public List<Employee> fetchDataByLastName(@RequestParam("lastname") String lastname){ 
        return empServ.findByLastname(lastname);
        
    }
}
