package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.ServiceItem;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.ServiceItemRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ServiceItemService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceItemServiceImpl implements ServiceItemService {

    private final ServiceItemRepo serviceItemRepo;

    public ServiceItemServiceImpl(ServiceItemRepo serviceItemRepo) {
        this.serviceItemRepo = serviceItemRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<ServiceItem>> createService(ServiceItem serviceItem) {
        var savedServiceItem = serviceItemRepo.save(serviceItem);
        var page = PageRequest.of(0, 1);

        ApiResponse<ServiceItem> response = new ApiResponse<>(
                true,
                "data saved successfully",
                savedServiceItem,
                page
        );

        return ResponseEntity.ok(response);
    }
}
