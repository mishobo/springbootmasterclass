package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Manufacturer;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface ManufacturerService {

    ResponseEntity<ApiResponse<Manufacturer>> saveManufacturer(Manufacturer manufactures);

    ResponseEntity<ApiResponse<Manufacturer>> getManufacturerById(Long id);

}
