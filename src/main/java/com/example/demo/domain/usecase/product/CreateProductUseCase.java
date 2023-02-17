package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductUseCase {
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.saveProduct(product);
    }
}
