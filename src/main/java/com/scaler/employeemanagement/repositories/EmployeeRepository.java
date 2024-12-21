package com.scaler.employeemanagement.repositories;

import com.scaler.employeemanagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository provides basic CRUD operations:
    // save(), findById(), findAll(), deleteById() etc.
}