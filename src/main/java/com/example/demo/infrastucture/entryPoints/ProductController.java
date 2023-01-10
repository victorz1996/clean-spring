package com.example.demo.infrastucture.entryPoints;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.usecase.product.CreateProductUseCase;
import com.example.demo.domain.usecase.product.ListProductUseCase;
import com.example.demo.domain.usecase.product.ListProductsUseCase;
import com.example.demo.infrastucture.drivenAdapters.product.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@AllArgsConstructor
public class ProductController {
    private final ListProductsUseCase listProductsUseCase;
    private final ListProductUseCase listProductUseCase;
    private  final CreateProductUseCase createProductUseCase;

    @GetMapping()
    public List<Product> listProducts() {
        return listProductsUseCase.listProducts();
    }


    @GetMapping(path = "/{productId}")
    public Product listProduct(@PathVariable Long productId) {
        return listProductUseCase.getProduct(productId);
    }

    @PostMapping()
    public Product createProduct(@Validated @RequestBody ProductEntity product){
        return createProductUseCase.createProduct(product);
    }
}
