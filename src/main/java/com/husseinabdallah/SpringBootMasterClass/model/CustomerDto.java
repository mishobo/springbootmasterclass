package com.husseinabdallah.SpringBootMasterClass.model;

import jakarta.validation.constraints.NotNull;

public record CustomerDto(
        Long id,
        @NotNull(message = "Name cannot be null")
        String name,
        String address) {
}
