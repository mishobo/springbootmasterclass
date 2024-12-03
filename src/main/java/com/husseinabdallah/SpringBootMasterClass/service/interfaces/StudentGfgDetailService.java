package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfgDetail;

import java.util.Optional;

public interface StudentGfgDetailService {

     Optional<StudentGfgDetail> getStudentGfgDetail(Long id);

}
