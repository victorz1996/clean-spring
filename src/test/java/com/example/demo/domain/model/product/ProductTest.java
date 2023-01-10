package com.example.demo.domain.model.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    @BeforeEach
    void setup(){
        Product productNoArgs = new Product();
        this.product = new Product(2L, "name" , "category", 5, 12.0);
    }
    @Test
    void getId() {
        Assertions.assertEquals(2L, this.product.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("name", this.product.getName());
    }

    @Test
    void getCategory() {
        Assertions.assertEquals("category", this.product.getCategory());

    }

    @Test
    void getStock() {
        Assertions.assertEquals(5, this.product.getStock());
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(12.0, this.product.getPrice());
    }

    @Test
    void setId() {
        this.product.setId(3L);
        Assertions.assertEquals(3L,this.product.getId());
    }

    @Test
    void setName() {
        this.product.setName("Nuevo");
        Assertions.assertEquals("Nuevo",this.product.getName());
    }

    @Test
    void setCategory() {
        this.product.setCategory("Categoria nueva");
        Assertions.assertEquals("Categoria nueva",this.product.getCategory());
    }

    @Test
    void setStock() {
        this.product.setStock(6);
        Assertions.assertEquals(6,this.product.getStock());
    }

    @Test
    void setPrice() {
        this.product.setPrice(80.0);
        Assertions.assertEquals(80.0,this.product.getPrice());
    }
}