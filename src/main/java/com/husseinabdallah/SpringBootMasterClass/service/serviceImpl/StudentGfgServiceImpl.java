package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.StudentGfgRepository;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.StudentGfgService;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentGfgServiceImpl implements StudentGfgService {

    private final StudentGfgRepository studentGfgRepository;

    public StudentGfgServiceImpl(StudentGfgRepository studentGfgRepository) {
        this.studentGfgRepository = studentGfgRepository;
    }


    @Override
    public StudentGfg createStudent(StudentGfg studentGfg) {
        return studentGfgRepository.save(studentGfg);
    }

    @Override
    public ResponseEntity<ApiResponse<StudentGfg>> getStudentGfg(Long id) {
        var studentGfg = studentGfgRepository.findByStudentId(id);
        ApiResponse<StudentGfg> response = new ApiResponse<>(
                true,
                "data fetched successfully",
                studentGfg,
                null);
        return ResponseEntity.ok(response);
    }

}
