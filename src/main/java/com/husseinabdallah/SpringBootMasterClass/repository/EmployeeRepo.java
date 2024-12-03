package com.husseinabdallah.SpringBootMasterClass.repository;


import com.husseinabdallah.SpringBootMasterClass.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Employee findByEmpId(int empId);

}
