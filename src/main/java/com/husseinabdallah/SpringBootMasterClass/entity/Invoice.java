package com.husseinabdallah.SpringBootMasterClass.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;
    private String invoiceNumber;
    private String amount;
    @Timestamp
    private LocalDateTime invoiceDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "visit_id")
    @JsonBackReference
    private Visit visit;

}
