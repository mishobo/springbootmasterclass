package com.husseinabdallah.SpringBootMasterClass.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    private String providerName;
    private String patientName;
    private String memberNumber;
    private LocalDateTime visitDate = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER, mappedBy = "visit")
    @JsonManagedReference
    private List<Invoice> invoices;

}