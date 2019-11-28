/**
 * 
 */
package com.employee.portal.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Sort;

import com.employee.portal.bean.Employee;
import com.employee.portal.repository.EmployeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@InjectMocks
	EmployeeServiceImpl service;
	
	@Mock
	EmployeeRepository EmployeeRepository;
	/**
	 * Test method for {@link com.employee.portal.serviceimpl.EmployeeServiceImpl#getAllEmployee()}.
	 */
	@Test
	public void testGetAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("name", "last", "M", "department", new Date()));
		employee.add(new Employee("name1", "last1", "M", "department1",
				new Date()));
   try {
	   when(EmployeeRepository.findAll(Sort.by(Sort.Direction.ASC,"firstName"))).thenReturn(employee);
   }catch (Exception e)
   {
	   System.out.println(e);
   }
    assertEquals(2,service.getAllEmployee().size());
	}

	/**
	 * Test method for {@link com.employee.portal.serviceimpl.EmployeeServiceImpl#registerEmployee(com.employee.portal.bean.Employee)}.
	 */
	@Test
	public void testRegisterEmployee() {
		Employee employee = new Employee("name", "last", "M", "department", new Date());
		when(EmployeeRepository.save(employee)).thenReturn(employee);
		assertEquals(employee,service.registerEmployee(employee));
	}

}
