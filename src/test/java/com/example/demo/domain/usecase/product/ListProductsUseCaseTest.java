package com.example.demo.domain.usecase.product;

import com.example.demo.domain.model.category.Category;
import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.model.product.gateways.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListProductsUseCaseTest {
    ProductRepository productRepository = mock(ProductRepository.class);
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    ListProductsUseCase listProductsUseCase = new ListProductsUseCase(productRepository);

    @Test
    void listProducts() {
        Product producto = new Product();
        Category category = new Category(1,"Nueva categoria", true);
        producto.setId(1);
        producto.setName("Nuevo");
        producto.setCategory(category);
        producto.setStock(5);
        producto.setPrice(12.0);
        List<Product> listaProductos = new ArrayList<Product>();
        listaProductos.add(producto);
        when(productRepository.getProducts()).thenReturn(listaProductos);
        Assertions.assertEquals(1, listProductsUseCase.listProducts().size());;
    }
}