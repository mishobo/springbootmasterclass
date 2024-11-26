package com.husseinabdallah.SpringBootMasterClass.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student_gfg_detail")
public class StudentGfgDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "college")
    private String college;

    @Column(name = "no_of_problems_solved")
    private int noOfProblemsSolved;

    public StudentGfgDetail() {}

    public StudentGfgDetail(String college, int noOfProblemsSolved) {
        this.college = college;
        this.noOfProblemsSolved = noOfProblemsSolved;
    }

}
