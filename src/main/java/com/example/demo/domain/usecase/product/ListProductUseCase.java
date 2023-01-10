package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

@AllArgsConstructor
public class ListProductUseCase {
    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    public Product getProduct(Long productId){
        return modelMapper.map(productRepository.getProduct(productId), Product.class);
    }
}
