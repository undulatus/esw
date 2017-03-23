package com.pointwest.workforce.planner.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pointwest.workforce.planner.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findByLastname(String lastname);
    List<Employee> findAll();
}
