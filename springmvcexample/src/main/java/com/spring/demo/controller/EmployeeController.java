package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", service.getAllEmployees());
		return "employeesListDisplay";
	}

}
