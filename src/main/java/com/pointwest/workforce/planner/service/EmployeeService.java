package com.pointwest.workforce.planner.service;

import java.util.List;

import com.pointwest.workforce.planner.domain.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	public List<Employee> findByLastname(String lastname);

}
