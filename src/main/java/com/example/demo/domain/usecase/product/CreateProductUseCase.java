package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import com.example.demo.infrastucture.drivenAdapters.product.ProductEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

@AllArgsConstructor
public class CreateProductUseCase {
    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    public Product createProduct(ProductEntity product){
        return modelMapper.map(productRepository.createProduct(product), Product.class);
    }
}
