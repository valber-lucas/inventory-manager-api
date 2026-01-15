package com.valber.inventory.dto;

import java.math.BigDecimal;

public record ProductResponseDTO(
        Long id,
        String sku,
        String name,
        BigDecimal price,
        Integer quantity,
        String status
) {}