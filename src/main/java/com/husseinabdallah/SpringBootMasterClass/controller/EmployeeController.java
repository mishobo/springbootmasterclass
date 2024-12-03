package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Employee;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/create-employee", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Employee>> createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }


    @GetMapping(value = "/get-employee", produces = "application/json")
    public ResponseEntity<ApiResponse<Employee>> getEmployeeById(int empId) {
        return employeeService.fetchEmployee(empId);
    }

}
