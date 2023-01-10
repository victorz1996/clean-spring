package com.example.demo.domain.model.product.gateways;

import com.example.demo.domain.model.product.Product;
import com.example.demo.infrastucture.drivenAdapters.product.ProductEntity;

import java.util.List;

public interface ProductRepository {
    ProductEntity createProduct(Product product);
    List<ProductEntity> getProducts();
    ProductEntity getProduct(Long productId);

}
