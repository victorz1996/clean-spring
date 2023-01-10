package com.example.demo.infrastucture.entryPoints;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.usecase.product.ListProductUseCase;
import com.example.demo.domain.usecase.product.ListProductsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@AllArgsConstructor
public class ProductController {
    private final ListProductsUseCase listProductsUseCase;
    private final ListProductUseCase listProductUseCase;

    @GetMapping()
    public List<Product> listProducts() {
        return listProductsUseCase.listProducts();
    }


    @GetMapping(path = "/{productId}")
    public Product listProduct(@PathVariable Long productId) {
        return listProductUseCase.getProduct(productId);
    }
}
