package com.agent47.employeemanagement.service;

import com.agent47.employeemanagement.entity.Employee;
import com.agent47.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Employee employee= employeeRepository.getReferenceById(employeeId);
        if(employee!=null){
            employeeRepository.deleteById(employeeId);
        }
        return employee;
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee employee) {
        Employee employee1= employeeRepository.updateEmployeeById(employeeId);
        em
    }
}
