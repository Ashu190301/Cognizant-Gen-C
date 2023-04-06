package com.cts.ems.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ems.employeemanagementsystem.dao.EmployeeDao;
import com.cts.ems.employeemanagementsystem.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	@Override
	public String addEmployee(Employee employee) {
		String str="";
		int noOfRow=-1;
		
		noOfRow = employeeDao.addEmployee(employee);
		str="no of row added "+ noOfRow;
		
		return str;
	}

}
