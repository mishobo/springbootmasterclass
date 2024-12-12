package com.husseinabdallah.SpringBootMasterClass.model;

public record ApiResponse<T> (
        Boolean status,
        String message,
        T data,
        Object metadata
        ){}
