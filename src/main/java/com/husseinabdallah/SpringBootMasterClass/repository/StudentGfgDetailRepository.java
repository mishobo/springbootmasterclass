package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfgDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentGfgDetailRepository extends JpaRepository <StudentGfgDetail, Long>{

    Optional<StudentGfgDetail> findStudentGfgDetailById(Long id);

}
