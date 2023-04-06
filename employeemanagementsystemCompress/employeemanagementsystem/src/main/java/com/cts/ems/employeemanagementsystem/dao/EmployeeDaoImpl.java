package com.cts.ems.employeemanagementsystem.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.ems.employeemanagementsystem.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private final static String SQL_ADD_EMP = "insert into employee (fname,lname,gender,dob,city,country,pin,phno)  values(?,?,?,?,?,?,?,?)";

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addEmployee(Employee employee) {

		int noOfRow = jdbcTemplate.update(SQL_ADD_EMP, employee.getFirstName(), employee.getLastName(),
				employee.getGender(), employee.getDob(), employee.getCity(), employee.getCountry(), employee.getPin(),
				employee.getMobile());

		return noOfRow;
	}

}
