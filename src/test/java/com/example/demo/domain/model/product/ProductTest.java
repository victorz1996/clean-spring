package com.example.demo.domain.model.product;

import com.example.demo.domain.model.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    Category category;
    @BeforeEach
    void setup(){
        Product productNoArgs = new Product();
        Category category = new Category(1,"Nueva categoria", true);
        this.product = new Product(2, "name" , 1, 5, 12.0, true, category);
    }
    @Test
    void getId() {
        Assertions.assertEquals(2, this.product.getId());
    }

    @Test
    void getName() {
        Assertions.assertEquals("name", this.product.getName());
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
        this.product.setId(3);
        Assertions.assertEquals(3,this.product.getId());
    }

    @Test
    void setName() {
        this.product.setName("Nuevo");
        Assertions.assertEquals("Nuevo",this.product.getName());
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