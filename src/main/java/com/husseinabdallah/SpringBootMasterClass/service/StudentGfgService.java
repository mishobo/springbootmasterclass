package com.husseinabdallah.SpringBootMasterClass.service;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;

import java.util.Optional;

public interface StudentGfgService {

    StudentGfg createStudent (StudentGfg studentGfg);

    Optional<StudentGfg> getStudentGfg(Long id);

}
