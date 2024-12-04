package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepo extends JpaRepository<Model, Long> {

    Model findByModelId(Long modelId);

}
