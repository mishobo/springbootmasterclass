package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Employee;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.EmployeeRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<Employee>> saveEmployee(Employee employee) {
        System.out.println(employee);
        var savedEmployee = employeeRepo.save(employee);
        ApiResponse<Employee> response= new
                ApiResponse<>(
                        "successful",
                "data saved successfully",
                savedEmployee,
                null
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Employee>> fetchEmployee(int empId) {
        var employee = employeeRepo.findByEmpId(empId);
        ApiResponse<Employee> response = new ApiResponse<>(
                "successful",
                "data fetched successfully",
                employee,
                null
        );
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
