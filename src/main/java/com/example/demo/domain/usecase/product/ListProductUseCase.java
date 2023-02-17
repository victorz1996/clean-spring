package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListProductUseCase {
    private ProductRepository productRepository;

    public Product getProduct(Integer productId){
        return productRepository.getProduct(productId);
    }
}
