package com.husseinabdallah.SpringBootMasterClass.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String location;

    @OneToMany(cascade = CascadeType.ALL,
             fetch = FetchType.EAGER)
    private List<Employee> employee  = new ArrayList<>();;

    public Address(int addressId, String location) {
        this.addressId = addressId;
        this.location = location;
    }
}
