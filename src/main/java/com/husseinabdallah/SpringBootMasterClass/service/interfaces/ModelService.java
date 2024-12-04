package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.entity.Model;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface ModelService {

    ResponseEntity<ApiResponse<Model>> saveModel(Model model);

    ResponseEntity<ApiResponse<Model>> getModel(Long modelId);

}
