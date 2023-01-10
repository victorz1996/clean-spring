package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.product.gateways.ProductRepository;
import com.example.demo.infrastucture.drivenAdapters.product.ProductEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListProductsUseCaseTest {


    ModelMapper modelMapper = mock(ModelMapper.class);

    ProductRepository productRepository = mock(ProductRepository.class);

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    ListProductsUseCase listProductsUseCase = new ListProductsUseCase(modelMapper, productRepository);

    @Test
    void listProducts() {
        ProductEntity producto = new ProductEntity();
        producto.setId(1L);
        producto.setName("Nuevo");
        producto.setCategory("Nuevos");
        producto.setStock(5);
        producto.setPrice(12.0);
        List<ProductEntity> listaProductos = new ArrayList<ProductEntity>();
        listaProductos.add(producto);
        when(productRepository.getProducts()).thenReturn(listaProductos);
        Assertions.assertEquals(1, listProductsUseCase.listProducts().size());;
    }
}