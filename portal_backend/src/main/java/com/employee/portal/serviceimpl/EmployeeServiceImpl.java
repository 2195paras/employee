package com.employee.portal.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.portal.bean.Employee;
import com.employee.portal.dao.EmployeeDao;
import com.employee.portal.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	/**
	 * Method to get all Employee list
	 * @return List<Employee> 
	 */
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		logger.info("Getting all employee");
		try {
			employee = employeeDao.getAllEmployee();
			logger.info("Getting all employee = {}",employee.toString());
		} catch (Exception exception) {
			logger.error(exception.getMessage());
		}
		return employee;
	}
	/**
	 * Method to register employee 
	 * @return List<Employee> 
	 */
	@Override
	public Employee registerEmployee(Employee employee) {
		Employee updatedEmployee = null;
		try {
			logger.info("saving employee = {}", employee);
			updatedEmployee = employeeDao.registerEmployee(employee);
		} catch (Exception exception) {
			logger.error(exception.getMessage());
		}
		return updatedEmployee;
	}
}

