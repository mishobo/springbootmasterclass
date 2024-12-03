package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfgDetail;
import com.husseinabdallah.SpringBootMasterClass.repository.StudentGfgDetailRepository;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.StudentGfgDetailService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentGfgDetailsServiceImpl implements StudentGfgDetailService {

    private final StudentGfgDetailRepository studentGfgDetailRepository;

    public StudentGfgDetailsServiceImpl(StudentGfgDetailRepository studentGfgDetailRepository) {
        this.studentGfgDetailRepository = studentGfgDetailRepository;
    }

    @Override
    public Optional<StudentGfgDetail> getStudentGfgDetail(Long id) {
        return studentGfgDetailRepository.findStudentGfgDetailById(id);
    }
}
