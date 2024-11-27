package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;
import com.husseinabdallah.SpringBootMasterClass.repository.StudentGfgRepository;
import com.husseinabdallah.SpringBootMasterClass.service.StudentGfgService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Optional<StudentGfg> getStudentGfg(Long id) {
        return studentGfgRepository.findById(id);
    }

}
