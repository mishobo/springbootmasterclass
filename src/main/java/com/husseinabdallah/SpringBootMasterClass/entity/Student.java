package com.husseinabdallah.SpringBootMasterClass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private int age;
}
