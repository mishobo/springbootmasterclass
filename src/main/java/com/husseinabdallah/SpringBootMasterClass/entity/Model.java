package com.husseinabdallah.SpringBootMasterClass.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;
    // Name of the model
    private String name;
    // A model belongs to one manufacturer
    // Foreign key referencing the manufacturer table
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacture_id")
    private Manufacturer manufacturer;

    public Model() {}

    public Model(Long modelId, String name, Manufacturer manufacturer) {
        this.modelId = modelId;
        this.name = name;
        this.manufacturer = manufacturer;
    }


}
