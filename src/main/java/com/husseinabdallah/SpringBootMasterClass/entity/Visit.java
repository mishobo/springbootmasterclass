package com.husseinabdallah.SpringBootMasterClass.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visitId;
    private String benefitName;
    private int benefitId;
    private String providerName;
    private String providerId;
    private String patientName;
    private String memberNumber;
    @Timestamp
    private LocalDateTime visitDate = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "visit")
    @JsonManagedReference
    private List<Invoice> invoices;

}
