package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.ServiceItem;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface ServiceItemService {
    ResponseEntity<ApiResponse<ServiceItem>> createService(ServiceItem serviceItem);
}
