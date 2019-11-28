package com.employee.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.portal.bean.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	

}
