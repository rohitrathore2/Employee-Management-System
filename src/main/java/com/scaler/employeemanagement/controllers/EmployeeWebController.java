package com.scaler.employeemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.scaler.employeemanagement.services.EmployeeService;

@Controller
public class EmployeeWebController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.readEmployees());
        return "list-employees.html";
    }
}