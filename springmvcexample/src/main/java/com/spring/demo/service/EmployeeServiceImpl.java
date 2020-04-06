package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.EmployeeDAO;
import com.spring.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    EmployeeDAO dao;
     
    public List<Employee> getAllEmployees()
    {
        return dao.getAllEmployees();
    }

}
