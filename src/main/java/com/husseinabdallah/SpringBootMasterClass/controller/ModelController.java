package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.entity.Model;
import com.husseinabdallah.SpringBootMasterClass.model.ApiResponse;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/model")
public class ModelController {

    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping(path = "/create-model", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ApiResponse<Model>> createModel(@RequestBody Model model) {
        return modelService.saveModel(model);
    }

    @GetMapping(path = "/get-model", produces = "application/json")
    public ResponseEntity<ApiResponse<Model>> getModel(@RequestParam(name = "modelId") Long modelId) {
        return modelService.getModel(modelId);
    }


}
