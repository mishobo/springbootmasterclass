package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface StudentGfgService {

    StudentGfg createStudent (StudentGfg studentGfg);

    ResponseEntity<ApiResponse<StudentGfg>> getStudentGfg(Long id);

}
