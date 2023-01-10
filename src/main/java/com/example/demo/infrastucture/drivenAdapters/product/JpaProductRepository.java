package com.example.demo.infrastucture.drivenAdapters.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
    ProductEntity getProductEntityById(Long productoId);
}
