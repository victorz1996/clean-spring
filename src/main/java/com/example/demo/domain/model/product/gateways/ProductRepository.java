package com.example.demo.domain.model.product.gateways;

import com.example.demo.domain.model.product.Product;

import java.util.List;

public interface ProductRepository {
    Product saveProduct(Product product);
    List<Product> getProducts();
    Product getProduct(Integer productId);
    void deleteProduct(Integer productId);

}
