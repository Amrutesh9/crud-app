package com.nimap.machinetest.service;

import com.nimap.machinetest.dto.ProductDTO;
import com.nimap.machinetest.model.Product;
import com.nimap.machinetest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<ProductDTO> getAllProducts(int page, int size) {
        Page<Product> productPage = productRepository.findAll(PageRequest.of(page, size));
        return productPage.map(product -> new ProductDTO(product.getId(), product.getName(), product.getPrice()));
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product = productRepository.save(product);
        return new ProductDTO(product.getId(), product.getName(), product.getPrice());
    }

    @Override
    public Optional<ProductDTO> getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(prod -> new ProductDTO(prod.getId(), prod.getName(), prod.getPrice()));
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO updatedProductDTO) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(updatedProductDTO.getName());
        product.setPrice(updatedProductDTO.getPrice());
        product = productRepository.save(product);
        return new ProductDTO(product.getId(), product.getName(), product.getPrice());
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
