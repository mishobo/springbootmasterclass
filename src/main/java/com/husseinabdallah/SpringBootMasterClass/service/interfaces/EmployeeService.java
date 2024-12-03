package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Employee;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    ResponseEntity<ApiResponse<Employee>> saveEmployee(Employee employee);

    ResponseEntity<ApiResponse<Employee>> fetchEmployee(int empId);


}
