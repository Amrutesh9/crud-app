package com.nimap.machinetest.service;

import com.nimap.machinetest.dto.ProductDTO;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductService {
    Page<ProductDTO> getAllProducts(int page, int size);
    ProductDTO createProduct(ProductDTO productDTO);
    Optional<ProductDTO> getProductById(Long id);
    ProductDTO updateProduct(Long id, ProductDTO updatedProductDTO);
    void deleteProduct(Long id);
}
