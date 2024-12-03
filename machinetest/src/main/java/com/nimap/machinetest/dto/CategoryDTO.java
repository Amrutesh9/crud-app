package com.nimap.machinetest.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDTO {

    // Getters and Setters
    private Long id;
    private String name;

    // Constructor
    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
