package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Manufacturer;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.ManufacturerRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ManufacturerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepo manufacturerRepo;

    public ManufacturerServiceImpl(ManufacturerRepo manufacturerRepo) {
        this.manufacturerRepo = manufacturerRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<Manufacturer>> saveManufacturer(Manufacturer manufactures) {
        var manufacturer = manufacturerRepo.save(manufactures);

        ApiResponse<Manufacturer> response = new ApiResponse<>(
                true,
                "data save successfully",
                manufacturer,
                null
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Manufacturer>> getManufacturerById(Long id) {
        var manufacturer = manufacturerRepo.findById(id).orElse(null);

        ApiResponse<Manufacturer> response = new ApiResponse<>(
                true,
                "data fetched successfully",
                manufacturer,
                null
        );
        return ResponseEntity.ok(response);
    }
}
