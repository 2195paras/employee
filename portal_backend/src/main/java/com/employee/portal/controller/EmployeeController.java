package com.employee.portal.controller;

import java.util.HashMap;
import java.util.List;




import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.portal.bean.Employee;
import com.employee.portal.service.EmployeeService;
import com.employee.portal.util.ServiceStaticValues;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService; 
	
	final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@GetMapping("/get")
	public List<Employee> getAllEmployee(){
		logger.info("get");
		return employeeService.getAllEmployee();
	}

	@PostMapping("/register")
	public ResponseEntity<Map<String,Object>> saveEmployee(@RequestBody Employee employee ){
		Map<String,Object> response = new HashMap<>();
		logger.info("Save Emloyee with details={}",employee.toString());
		Employee updatedEmployee= employeeService.registerEmployee(employee);
		
		if(updatedEmployee!=null){
			response.put(ServiceStaticValues.RESPONSE_STATUS,ServiceStaticValues.RESPONSE_STATUS_SUCCESS);
			response.put(ServiceStaticValues.RESPONSE_PAYLOAD, updatedEmployee);
		} else {
			response.put(ServiceStaticValues.RESPONSE_STATUS,ServiceStaticValues.RESPONSE_STATUS_ERROR);
			response.put(ServiceStaticValues.RESPONSE_MESSAGE, ServiceStaticValues.RESPONSE_NO_DATA_SAVED);
		}
		return ResponseEntity.accepted().body(response);
	}
	
}
