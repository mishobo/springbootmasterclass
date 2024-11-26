package com.husseinabdallah.SpringBootMasterClass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String dob;
    String pinCode;

    public User(int id, String name, String dob, String pinCode) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.pinCode = pinCode;
    }
}
