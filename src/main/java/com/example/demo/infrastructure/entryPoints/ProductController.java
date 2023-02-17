package com.example.demo.infrastructure.entryPoints;

import com.example.demo.domain.model.product.Product;
import com.example.demo.domain.usecase.product.CreateProductUseCase;
import com.example.demo.domain.usecase.product.ListProductUseCase;
import com.example.demo.domain.usecase.product.ListProductsUseCase;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ApiOperation("Get all products")
    @ApiResponse(code=200, message = "OK")
    public ResponseEntity<List<Product>> listProducts() {
        return new ResponseEntity<>(listProductsUseCase.listProducts(), HttpStatus.OK);
    }
    @GetMapping(path = "/{productId}")
    @ApiOperation("Get product by id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Product not found"),
    })
    public ResponseEntity<Product> listProduct(@ApiParam(value = "the id of the product", required = true, example = "7")
                                                   @PathVariable Integer productId) {
        return new ResponseEntity<>(listProductUseCase.getProduct(productId), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Product> createProduct(@Validated @RequestBody Product product){
        return new ResponseEntity<>(createProductUseCase.createProduct(product), HttpStatus.CREATED);
    }
}
