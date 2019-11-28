package com.employee.portal.dao;

import java.util.List;

import com.employee.portal.bean.Employee;

public interface EmployeeDao {
/**
 * Method to get all Employee list
 * @return List<Employee> 
 */
List<Employee> getAllEmployee();
	/**
	 * Method to register employee 
	 * @param employee
	 * @return Employee
	 */
Employee registerEmployee(Employee employee );

}
