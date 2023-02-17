package com.example.demo.infrastructure.drivenAdapters.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity getProductEntityById(Integer productId);
}
