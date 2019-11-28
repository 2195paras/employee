package com.employee.portal.bean;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String departmentName;
	private String gender;
	private Date dateOfBirth;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", departmentName="
				+ departmentName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
	public Employee() {
		super();
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param departmentName
	 * @param gender
	 * @param date
	 */
	public Employee(String firstName, String lastName, String departmentName,
			String gender, Date date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.gender = gender;
		this.dateOfBirth = date;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}
