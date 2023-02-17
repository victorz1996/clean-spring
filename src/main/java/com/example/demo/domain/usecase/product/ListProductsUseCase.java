package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ListProductsUseCase {
    private ProductRepository productRepository;
    public List<Product> listProducts() {
        return productRepository.getProducts();
    }
}
