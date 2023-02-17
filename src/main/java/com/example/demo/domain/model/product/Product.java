package com.example.demo.domain.model.product;

import com.example.demo.domain.model.category.Category;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer stock;
    private Double price;
    private Boolean status;
    private Category category;
}
