package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Visit;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.VisitService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/visit")
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @PostMapping(value = "/create-visit", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Visit>> createVisit(@RequestBody @Valid Visit visit) {
        return visitService.createVisit(visit);
    }

    @GetMapping(value = "/get-visit", produces = "application/json")
    public ResponseEntity<ApiResponse<Visit>> getVisit(@RequestParam Long visitId) {
        return visitService.getVisit(visitId);
    }

}
