package com.agent47.employeemanagement.controller;

import com.agent47.employeemanagement.entity.Employee;
import com.agent47.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable("id") Long employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long employeeId,@RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId,employee);
    }
}
