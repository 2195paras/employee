package com.employee.portal.daoimpl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Sort;

import com.employee.portal.bean.Employee;
import com.employee.portal.repository.EmployeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDaoImplTest {
@InjectMocks
	 EmployeeDaoImpl employeeDaoImpl;
@Mock
EmployeeRepository EmployeeRepository;
	@Test
	public void testGetAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("name", "last", "M", "de0partment", new Date()));
		employee.add(new Employee("name1", "last1", "M", "department1",
				new Date()));
    when(EmployeeRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"))).thenReturn(employee);
    assertEquals(2,employeeDaoImpl.getAllEmployee().size());
	}
	
	@Test
	public void testRegisterEmployee() {
		Employee employee = new Employee("name", "last", "M", "department", new Date());
		when(EmployeeRepository.save(employee)).thenReturn(employee);
		
		assertEquals(employee,employeeDaoImpl.registerEmployee(employee));
	}

}
