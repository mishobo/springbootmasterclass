package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Manufacturer;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepo extends JpaRepository<Manufacturer, Long> {

    Manufacturer findByManufacturerId(Long manufacturerId);


}
