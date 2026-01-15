package com.valber.inventory.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_products")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "O SKU é obrigatório")
    private String sku;

    @Column(nullable = false)
    @NotBlank(message = "O nome do produto é obrigatório")
    private String name;

    private String description;

    @Column(nullable = false)
    @NotNull(message = "O preço é obrigatório")
    @Min(value = 0, message = "O preço não pode ser negativo")
    private BigDecimal price;

    @Column(nullable = false)
    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 0, message = "A quantidade não pode ser negativa")
    private Integer quantity;

    @Column(nullable = false)
    @NotNull(message = "O limite mínimo é obrigatório")
    @Min(value = 1, message = "O limite mínimo deve ser pelo menos 1")
    private Integer minStockThreshold;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}