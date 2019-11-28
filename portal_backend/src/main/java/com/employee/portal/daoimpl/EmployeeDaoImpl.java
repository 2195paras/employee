package com.employee.portal.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.employee.portal.bean.Employee;
import com.employee.portal.dao.EmployeeDao;
import com.employee.portal.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * Method to get all Employee list
	 * @return List<Employee> 
	 */
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"));
	}
	/**
	 * Method to register employee 
	 * @param employee
	 * @return Employee
	 */
	@Override
	public Employee registerEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
