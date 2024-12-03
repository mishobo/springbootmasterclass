package com.husseinabdallah.SpringBootMasterClass.model;

public record ApiResponse<T> (
        String status,
        String message,
        T data,
        Object object
        ){}
