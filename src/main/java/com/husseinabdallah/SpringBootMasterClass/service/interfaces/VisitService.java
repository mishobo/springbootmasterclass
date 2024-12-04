package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Visit;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface VisitService {

    ResponseEntity<ApiResponse<Visit>> createVisit(Visit visit);

    ResponseEntity<ApiResponse<Visit>> getVisit(Long visitId);

}
