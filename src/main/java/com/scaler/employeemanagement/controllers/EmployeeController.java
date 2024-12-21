//package com.scaler.employeemanagement.controllers;
//
//import com.scaler.employeemanagement.models.Employee;
//import com.scaler.employeemanagement.services.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class EmployeeController {
//    // dependency injection
//    @Autowired
//    EmployeeService employeeService;
//
//    @GetMapping("employees")
//    public List<Employee> getAllEmployees(){
//
//        return employeeService.readEmployees();
//    }
//
//    @PostMapping("employees")
//    public String createEmployee(@RequestBody Employee employee){
//
//        return employeeService.createEmployee(employee);
//    }
//
//
//    @DeleteMapping("employees/{id}")
//    public String deleteEmployee(@PathVariable Long id){
//        if(employeeService.deleteEmployee(id)){
//            return "Deleted Successfully.";
//        }
//        return "Not found";
//    }
//
//}
//------------------
package com.scaler.employeemanagement.controllers;

import com.scaler.employeemanagement.models.Employee;
import com.scaler.employeemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")     // Base URL for all APIs
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create - POST /api/employees
    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // Read All - GET /api/employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    // Read One - GET /api/employees/{id}
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Update - PUT /api/employees/{id}
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // Delete - DELETE /api/employees/{id}
    @DeleteMapping("/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
}