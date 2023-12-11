package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Employee;
import com.example.demo.service.EmployeeService;


@Controller
@ResponseBody
@RestController
public class EmployeeController {

	
	
	@Autowired
	EmployeeService ser;
	
	

	//localhost:8080/addEmployee
	@PostMapping("/addEmployee")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(ser.addEmployee(e),HttpStatus.CREATED);
	}
	
	//19-4-2023
	//localhost:8080/empById
	@GetMapping("/empById")
	ResponseEntity<Employee> getById(@RequestBody Integer eid){
		return new ResponseEntity<Employee>(ser.getById(eid),HttpStatus.CREATED);
	}
	
	//localhost:8080/empByDesignation
	@GetMapping("/empByDesignation")
	ResponseEntity<List<Employee>> getByDesignation(@RequestHeader String designation){
		return new ResponseEntity<List<Employee>>(ser.getByDesignation(designation),HttpStatus.CREATED);
	}
	
	//localhost:8080/empByLessSal
	@GetMapping("/empByLessSal")
	ResponseEntity<List<Employee>> getByLessSal(@RequestHeader Double sal){
		return new ResponseEntity<List<Employee>>(ser.getByLessSal(sal),HttpStatus.CREATED);
	}
	
	@PutMapping("/updateEmp")
	ResponseEntity<Employee> updateEmp(@RequestBody Employee e){
		return new ResponseEntity<Employee>(ser.updateEmployee(e),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteEmp")
	ResponseEntity<Employee> deleteEmp(@RequestBody Employee e){
		return new ResponseEntity<Employee>(ser.deleteEmployee(e, null),HttpStatus.CREATED);
	}
	
}
