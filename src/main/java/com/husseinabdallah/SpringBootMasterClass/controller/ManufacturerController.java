package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Manufacturer;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ManufacturerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/manufacturer")
public class ManufacturerController {


    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }


    @PostMapping(value = "/create-manufacturer", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Manufacturer>> createManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.saveManufacturer(manufacturer);
    }


    @GetMapping(value = "/get-manufacturer", produces = "application/json")
    public ResponseEntity<ApiResponse<Manufacturer>> getManufacturer(@RequestParam(name = "manufacturerId") Long manufacturerId) {
        return manufacturerService.getManufacturerById(manufacturerId);
    }


}
