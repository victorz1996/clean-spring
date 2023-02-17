package com.example.demo.infrastructure.drivenAdapters.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class JpaProductImpl implements ProductRepository {
    private JpaProductRepository jpaProductRepository;
    private ProductMapper productMapper;
    @Override
    public Product saveProduct(Product product) {
        ProductEntity productEntity = productMapper.toProductEntity(product);
        return productMapper.toProduct(jpaProductRepository.save(productEntity));
    }
    @Override
    public List<Product> getProducts() {
        return productMapper.toProducts(jpaProductRepository.findAll());
    }
    @Override
    public void deleteProduct(Integer productId) {
        jpaProductRepository.deleteById(productId);
    }
    @Override
    public Product getProduct(Integer productId) {
        return productMapper.toProduct(jpaProductRepository.getProductEntityById(productId));
    }
}
