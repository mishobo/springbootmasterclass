package com.husseinabdallah.SpringBootMasterClass.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long manufacturerId;

    // Name of the manufacturer
    private String manufacturesName;

    // A manufacturer can have many models
    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Model> models;


    public Manufacturer() {}

    public Manufacturer(Long manufacturerId, String manufacturesName) {
        this.manufacturerId = manufacturerId;
        this.manufacturesName = manufacturesName;
    }
}
