package com.example.demo.infrastucture.drivenAdapters.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class JpaProductImpl implements ProductRepository {
    private JpaProductRepository jpaProductRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return jpaProductRepository.save(product);
    }

    @Override
    public List<ProductEntity> getProducts() {
        return jpaProductRepository.findAll();
    }

    @Override
    public ProductEntity getProduct(Long productId) {
        return jpaProductRepository.getProductEntityById(productId);
    }
}
