package com.employee.portal.service;

import java.util.List;

import com.employee.portal.bean.Employee;

public interface EmployeeService {
/**
 * 
 * @return List<Employee>
 */
	public List<Employee> getAllEmployee();
		
	
	public Employee registerEmployee(Employee employee );
}