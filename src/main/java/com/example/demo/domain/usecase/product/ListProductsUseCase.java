package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ListProductsUseCase {

    private ModelMapper modelMapper;


private ProductRepository productRepository;

public List<Product> listProducts(){ return productRepository.getProducts().stream().map(item -> {
    return modelMapper.map(item, Product.class);
}).collect(Collectors.toList()); }
}
