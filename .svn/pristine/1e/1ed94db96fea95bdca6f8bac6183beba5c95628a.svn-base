package com.pointwest.workforce.planner.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pointwest.workforce.planner.WorkforcePlannerApplication;
import com.pointwest.workforce.planner.data.EmployeeRepository;
import com.pointwest.workforce.planner.domain.Employee;
import com.pointwest.workforce.planner.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;

	private static final Logger log = LoggerFactory.getLogger(WorkforcePlannerApplication.class);
	
	@Override
	public List<Employee> findAll() {
	
		List<Employee> employees = empRepository.findAll();
		log.info("Employees found with findAll():");
		log.info("-------------------------------");
		for (Employee employee : employees) {
			log.info(employee.getLastname());
		}
		log.info("");
		
		return employees;

	}
	
	@Override
	public List<Employee> findByLastname(String lastname) {
		List<Employee> employees = empRepository.findByLastname(lastname);
		
		log.info("Employees found with findByLastName(" + lastname + "):");
		log.info("-------------------------------");
		for (Employee employee : employees) {
			log.info(employee.getFirstname());
		}
		log.info("");
		
		return employees;
	}


}
