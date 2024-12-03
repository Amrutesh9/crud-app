package com.nimap.machinetest.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {

    // Getters and Setters
    private Long id;
    private String name;
    private Double price;

    // Constructor
    public ProductDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
