package com.husseinabdallah.SpringBootMasterClass.service.serviceImpl;

import com.husseinabdallah.SpringBootMasterClass.entity.Model;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.repository.ModelRepo;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepo modelRepo;

    public ModelServiceImpl(ModelRepo modelRepo) {
        this.modelRepo = modelRepo;
    }

    @Override
    public ResponseEntity<ApiResponse<Model>> saveModel(Model model) {
        var savedModel = modelRepo.save(model);

        ApiResponse<Model> response = new ApiResponse<>(
                "success",
                "data saved Successfully",
                savedModel,
                null
        );

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ApiResponse<Model>> getModel(Long modelId) {
        var model = modelRepo.findByModelId(modelId);

        ApiResponse<Model> response = new ApiResponse<>(
                "success",
                "data fetched successfully",
                model,
                null
        );

        return ResponseEntity.ok(response);
    }
}
