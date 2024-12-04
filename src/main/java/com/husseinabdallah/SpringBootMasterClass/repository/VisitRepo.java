package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepo extends JpaRepository<Visit, Long> {

    Visit findByVisitId(Long visitId);

}
