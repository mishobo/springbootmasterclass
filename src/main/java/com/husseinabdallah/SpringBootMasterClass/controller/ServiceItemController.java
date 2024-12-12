package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.ServiceItem;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ServiceItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/serviceItem")
public class ServiceItemController {

    private final ServiceItemService serviceItemService;


    public ServiceItemController(ServiceItemService serviceItemService) {
        this.serviceItemService = serviceItemService;
    }


    @PostMapping(value = "/create-serviceItem", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<ServiceItem>> createServiceItem(@RequestBody ServiceItem serviceItem) {
        return serviceItemService.createService(serviceItem);
    }

}
