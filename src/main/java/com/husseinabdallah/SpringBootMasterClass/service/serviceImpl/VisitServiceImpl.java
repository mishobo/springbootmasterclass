package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Visit;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.VisitRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.VisitService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {

    private final VisitRepo visitRepo;

    public VisitServiceImpl(VisitRepo visitRepo) {
        this.visitRepo = visitRepo;
    }


    @Override
    public ResponseEntity<ApiResponse<Visit>> createVisit(Visit visit) {
        var saveVisit = visitRepo.save(visit);

        ApiResponse<Visit> response = new ApiResponse<>(
                true,
                "data saved successfully",
                saveVisit,
                null
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Visit>> getVisit(Long visitId) {
        var existingVisit = visitRepo.findByVisitId(visitId);
        var page = PageRequest.of(0, 1);

        ApiResponse<Visit> response = new ApiResponse<>(
                true,
                "data fetched successfully",
                existingVisit,
                page
        );
        return ResponseEntity.ok(response);
    }
}
