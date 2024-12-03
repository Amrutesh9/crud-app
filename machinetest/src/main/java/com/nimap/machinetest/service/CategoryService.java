package com.nimap.machinetest.service;

import com.nimap.machinetest.dto.CategoryDTO;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface CategoryService {
    Page<CategoryDTO> getAllCategories(int page, int size);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    Optional<CategoryDTO> getCategoryById(Long id);
    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);
    void deleteCategory(Long id);
}
