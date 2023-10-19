package com.agent47.employeemanagement.service;

import com.agent47.employeemanagement.entity.Employee;
import com.agent47.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee deleteEmployee(Long employeeId) {
        Employee employee= employeeRepository.findById(employeeId).get();
        employeeRepository.deleteById(employeeId);
        return employee;
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee employee) {
        Employee employee1=employeeRepository.findById(employeeId).get();
        if(Objects.nonNull(employee.getFirstName())&&!"".equalsIgnoreCase(employee.getFirstName())) {
            employee1.setFirstName(employee.getFirstName());
        }
        if(Objects.nonNull(employee.getLastName())&&!"".equalsIgnoreCase(employee.getLastName())) {
            employee1.setLastName(employee.getLastName());
        }
        if(Objects.nonNull(employee.getEmail())&&!"".equalsIgnoreCase(employee.getEmail())) {
            employee1.setEmail(employee.getEmail());
        }
        return employeeRepository.save(employee1);

    }
}
