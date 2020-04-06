package com.spring.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
        
        Employee vo1 = new Employee();
        vo1.setId(1);
        vo1.setFirstname("Lokesh");
        vo1.setLastname("Gupta");
        employees.add(vo1);
         
        Employee vo2 = new Employee();
        vo2.setId(2);
        vo2.setFirstname("Raj");
        vo2.setLastname("Kishore");
        employees.add(vo2);
         
        return employees;
		
	}

}
