package com.agent47.employeemanagement.service;

import com.agent47.employeemanagement.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee deleteEmployee(Long employeeId);

    Employee updateEmployee(Long employeeId, Employee employee);
}
