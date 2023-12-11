package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee e);

	Employee getById(Integer eid);
	
	List<Employee> getByDesignation(String designation);
	
	List<Employee> getByLessSal(Double sal);
	
	Employee updateEmployee(Employee e);
	
	Employee  deleteEmployee(Employee e ,Integer eid);

}
