package com.husseinabdallah.SpringBootMasterClass.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;

    // Many employees has one company address
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;

    public Employee() {}

    public Employee(int empId, String empName, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }


}
